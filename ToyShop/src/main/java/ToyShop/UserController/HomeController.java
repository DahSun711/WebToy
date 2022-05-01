package ToyShop.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ToyShop.Dao.HomeDao;
import ToyShop.Service.User.HomeServiceImpl;

@Controller
public class HomeController {
	@Autowired
	HomeServiceImpl HomeService;
	
	
	@RequestMapping(value= {"/","/trang-chu"})
	public ModelAndView Index() {
		ModelAndView mv = new ModelAndView("user/index");
		mv.addObject("slides", HomeService.GetDataSlides());
		mv.addObject("loaisanpham", HomeService.GetDataLoaisp());
		mv.addObject("sanpham", HomeService.GetDataSanPham());
		mv.setViewName("user/index");
		return mv;
	}
}
