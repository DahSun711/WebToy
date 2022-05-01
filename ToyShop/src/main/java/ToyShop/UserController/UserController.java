package ToyShop.UserController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ToyShop.Entity.Users;
import ToyShop.Service.User.AccountServiceImpl;
import ToyShop.Service.User.HomeServiceImpl;

@Controller
public class UserController {
	
	@Autowired
	HomeServiceImpl HomeService;
	
	Users userinfo;
	
	@Autowired
	AccountServiceImpl accountServiceImpl = new AccountServiceImpl();
	
	ModelAndView mv = new ModelAndView("user/account/register");
	@RequestMapping(value="/dang-ky", method = RequestMethod.GET)
	public  ModelAndView Register() {
		
		mv.addObject("users", new Users());
		return mv;
		
	}
	
	@RequestMapping(value="/dang-ky", method = RequestMethod.POST)
	public  ModelAndView CreateAcc(@ModelAttribute("Users") Users users) {
		int count = accountServiceImpl.AddAccount(users);
		if(count>0) {
			mv.addObject("status", "Đăng ký tài khoản thành công!");
		}
		else
		{
			mv.addObject("status", "Đăng ký tài khoản thất bại!");
		}
		//mv.addObject("status", true);
		mv.setViewName("user/account/register");
		return mv;
		
	}
	
	ModelAndView movi = new ModelAndView("user/account/login");
	@RequestMapping(value="/dang-nhap", method = RequestMethod.GET)
	public  ModelAndView login() {
		
		movi.addObject("users", new Users());
		return movi;
		
	}
	
	@RequestMapping(value="/dang-nhap", method = RequestMethod.POST)
	public  ModelAndView Login(HttpSession session ,@ModelAttribute("user") Users user) {
		user = accountServiceImpl.CheckAccount(user);
		
		if(user != null) {
			movi.setViewName("redirect:trang-chu");
			session.setAttribute("LoginInfo", user);
		}
		else
		{
			movi.addObject("status", "Đăng nhập thất bại!");
		}
		return movi;
		
	}
	
	@RequestMapping(value="/dang-xuat", method = RequestMethod.GET)
	public String Login(HttpSession session, HttpServletRequest request) {
		session.removeAttribute("LoginInfo");
		return "redirect:"+request.getHeader("Referer");
	}
}