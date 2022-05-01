package ToyShop.UserController;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ToyShop.Dto.CartDto;
import ToyShop.Entity.Bills;
import ToyShop.Entity.Users;
import ToyShop.Service.User.BillsServiceImpl;
import ToyShop.Service.User.CartServiceImpl;
import ToyShop.Service.User.HomeServiceImpl;

@Controller
public class CartController {
	
	@Autowired
	private CartServiceImpl cartService = new CartServiceImpl();
	@Autowired
	HomeServiceImpl HomeService;
	
	@Autowired 
	private BillsServiceImpl billsService = new BillsServiceImpl();
	
	
	@RequestMapping(value= "ListCart")
	public ModelAndView Index() {
		ModelAndView mv = new ModelAndView("user/index");
		mv.addObject("slides", HomeService.GetDataSlides());
		mv.addObject("loaisanpham", HomeService.GetDataLoaisp());
		mv.addObject("sanpham", HomeService.GetDataSanPham());
		mv.setViewName("user/cart/list_cart");
		return mv;
		
	}
	
	@RequestMapping(value = "AddCart/{id}")
	public String AddCart(HttpServletRequest request, HttpSession session, @PathVariable long id) {
		HashMap<Long, CartDto> cart = (HashMap<Long, CartDto>)session.getAttribute("Cart");
		if(cart == null) {
			cart = new HashMap<Long, CartDto>();
		}
		cart = cartService.AddCart(id, cart);
		session.setAttribute("Cart", cart);
		session.setAttribute("TotalQuantyCart", cartService.TotalQuanty(cart));
		session.setAttribute("TotalPriceCart", cartService.Totalprice(cart));
		return "redirect:"+request.getHeader("Referer");
	}
	
	@RequestMapping(value = "DeleteCart/{id}")
	public String DeleteCart(HttpServletRequest request, HttpSession session, @PathVariable long id) {
		HashMap<Long, CartDto> cart = (HashMap<Long, CartDto>)session.getAttribute("Cart");
		if(cart == null) {
			cart = new HashMap<Long, CartDto>();
		}
		cart = cartService.DeleteCart(id, cart);
		session.setAttribute("Cart", cart);
		session.setAttribute("TotalQuantyCart", cartService.TotalQuanty(cart));
		session.setAttribute("TotalPriceCart", cartService.Totalprice(cart));
		return "redirect:"+request.getHeader("Referer");
	}
	
	@RequestMapping(value = "EditCart/{id}/{quanty}")
	public String EditCart(HttpServletRequest request, HttpSession session, @PathVariable long id, @PathVariable int quanty) {
		HashMap<Long, CartDto> cart = (HashMap<Long, CartDto>)session.getAttribute("Cart");
		if(cart == null) {
			cart = new HashMap<Long, CartDto>();
		}
		cart = cartService.EditCart(id, quanty, cart);
		session.setAttribute("Cart", cart);
		session.setAttribute("TotalQuantyCart", cartService.TotalQuanty(cart));
		session.setAttribute("TotalPriceCart", cartService.Totalprice(cart));
		return "redirect:"+request.getHeader("Referer");
	}
	
	@RequestMapping(value = "checkout", method = RequestMethod.GET)
	public ModelAndView CheckOut(HttpServletRequest request, HttpSession session) {
		ModelAndView mv = new ModelAndView("user");
		mv.setViewName("user/bills/checkout");
		
		Bills bills = new Bills();
		Users loginInfo = (Users)session.getAttribute("LoginInfo");
		if (loginInfo !=null) {
			bills.setDIACHI(loginInfo.getDIACHI());
			bills.setHOTEN(loginInfo.getHOTEN());
			bills.setSDT(loginInfo.getSDT());
			
		}
				
		//
		mv.addObject("bills", bills);
		return mv;
		
	}
	@RequestMapping(value = "checkout", method = RequestMethod.POST)
	public String CheckOutBill(HttpServletRequest request, HttpSession session, @ModelAttribute("bills") Bills bill) {
		
		/*
		 * bill.setSOLUONG(Integer.parseInt( (String)
		 * session.getAttribute("TotalQuantyCart")));
		 * bill.setDONGIA(Double.parseDouble((String)session.getAttribute(
		 * "TotalPriceCart")));
		 */
		if (billsService.AddBills(bill) > 0) {
			HashMap<Long, CartDto> carts = (HashMap<Long, CartDto>)session.getAttribute("Cart");
			billsService.AddBillsDetail(carts);
		}
		session.removeAttribute("Cart");
		return "redirect:gio-hang";
		 
	}
	
}
