package ToyShop.AdminController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ToyShop.Service.User.HomeServiceImpl;

@Controller
public class AccountCRUDController {
	
	@Autowired
	HomeServiceImpl HomeService;
	@RequestMapping(value= "/quan-tri/user")
	public ModelAndView Index() {
		ModelAndView mv = new ModelAndView("admin/accUser/quanlyUser");
		mv.addObject("User", HomeService.GetDataUser());
		mv.setViewName("admin/accUser/quanlyUser");
		return mv;
		
	}
}
