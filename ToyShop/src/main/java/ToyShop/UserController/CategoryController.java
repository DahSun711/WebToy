package ToyShop.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ToyShop.Dto.PaginatesDto;
import ToyShop.Service.User.PaginateServiceImpl;
import ToyShop.Service.User.SanPhamServiceImpl;

import ToyShop.Service.User.HomeServiceImpl;
@Controller
public class CategoryController {

	@Autowired
	HomeServiceImpl HomeService;
	@Autowired
	private SanPhamServiceImpl sanphamService;
	@Autowired
	private PaginateServiceImpl paginateService;

	private int totalProductsPage = 4;
	
	@RequestMapping(value= "/san-pham/{id}")
	public ModelAndView Product(@PathVariable String id)
	{
		ModelAndView mv = new ModelAndView("user/products/category");
		mv.addObject("loaisanpham", HomeService.GetDataLoaisp());
 		//mv.addObject("idCategory", id);
		int totalData = sanphamService.GetAllSanPhamByID(Integer.parseInt(id)).size();
		
		PaginatesDto paginateInfo = paginateService.GetInfoPaginates(totalData, totalProductsPage, 1);
		mv.addObject("idCategory", id);
		mv.addObject("paginateInfo", paginateInfo);
		mv.addObject("productsPaginate", sanphamService.GetDataSanPhamPaginate(Integer.parseInt(id), paginateInfo.getStart(), totalProductsPage));
		return mv;
	}
	
	@RequestMapping(value= "/san-pham/{id}/{currentPage}")
	public ModelAndView Product(@PathVariable String id, @PathVariable String currentPage)
	{
		ModelAndView mv = new ModelAndView("user/products/category");
		mv.addObject("loaisanpham", HomeService.GetDataLoaisp());
		mv.addObject("ALLProducts", sanphamService.GetAllSanPhamByID(Integer.parseInt(id)));
		//mv.addObject("idCategory", id);
		int totalData = sanphamService.GetAllSanPhamByID(Integer.parseInt(id)).size();
		
		
		PaginatesDto paginateInfo = paginateService.GetInfoPaginates(totalData, totalProductsPage, Integer.parseInt(currentPage));
		mv.addObject("idCategory", id);
		mv.addObject("paginateInfo", paginateInfo);
		mv.addObject("productsPaginate", sanphamService.GetDataSanPhamPaginate(Integer.parseInt(id), paginateInfo.getStart(), totalProductsPage));
		return mv;
	}
}
