package ToyShop.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ToyShop.Service.User.HomeServiceImpl;
import ToyShop.Service.User.IProductService;

@Controller
public class ProductController {

	@Autowired
	HomeServiceImpl HomeService;
	
	@Autowired
	private IProductService _productService;

	@RequestMapping(value = { "chi-tiet-san-pham/{id}" })
	public ModelAndView Index(@PathVariable long id) 
	{
		ModelAndView mv = new ModelAndView("user/products/product");
		mv.addObject("loaisanpham", HomeService.GetDataLoaisp());
		mv.addObject("product", _productService.GetProductByID(id));
		int idCategory = _productService.GetProductByID(id).getMaloaisp();
		mv.addObject("productByIDCategory", _productService.GetProductByIDCategory(idCategory));
		return mv;

	}
}
