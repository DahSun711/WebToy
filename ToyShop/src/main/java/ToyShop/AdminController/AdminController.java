package ToyShop.AdminController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ToyShop.Service.User.HomeServiceImpl;
@Controller
public class AdminController {
	
	@Autowired
	HomeServiceImpl HomeService;
	
	@RequestMapping(value= "/quan-tri/")
	public ModelAndView Index() {
		ModelAndView mv = new ModelAndView("layouts/admin");
		mv.addObject("slides", HomeService.GetDataSlides());
		mv.setViewName("layouts/admin");
		return mv;
		
	}
}