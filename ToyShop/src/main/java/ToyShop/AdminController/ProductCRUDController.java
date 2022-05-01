package ToyShop.AdminController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ToyShop.Service.User.HomeServiceImpl;
@Controller
public class ProductCRUDController {
	
	@Autowired
	HomeServiceImpl HomeService;
	
	@RequestMapping(value= "quan-tri/product")
	public ModelAndView Index() {
		ModelAndView mv = new ModelAndView("admin/index");
		mv.addObject("slides", HomeService.GetDataSlides());
		return mv;
		
	}
	
	@RequestMapping(value= "quan-tri/product-save")
	public ModelAndView Product() {
		ModelAndView mv = new ModelAndView("admin/products/addproduct");
		return mv;
		
	}
}