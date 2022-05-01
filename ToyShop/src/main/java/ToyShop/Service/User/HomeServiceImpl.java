package ToyShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ToyShop.Dao.HomeDao;
import ToyShop.Dao.LoaispDao;
import ToyShop.Dao.SanPhamDao;
import ToyShop.Dao.UsersDao;
import ToyShop.Dto.SanPhamDto;
import ToyShop.Entity.Loaisp;
import ToyShop.Entity.Slides;
import ToyShop.Entity.Users;

@Service
public class HomeServiceImpl implements IHomeService {
	@Autowired
	private HomeDao slidesDao;
	@Autowired
	private LoaispDao loaispDao;

	@Autowired
	private SanPhamDao sanphamDao;

	@Autowired
	private UsersDao userDao;
	
	public List<Slides> GetDataSlides() {
		return slidesDao.GetDataSlides();

	}

	public List<Loaisp> GetDataLoaisp() {
		return loaispDao.GetDataLoaisp();
	}

	public List<SanPhamDto> GetDataSanPham() {
		List<SanPhamDto> listSanPham = sanphamDao.GetDataSanPham();
		listSanPham.get(0);
		return listSanPham;
	}
	
	public List<Users> GetDataUser(){
		return userDao.GetDataUser();
	}
	
	public void save(Slides slides) {
		 slidesDao.save(slides);
	}
	
	public void update(Slides slides) {
		slidesDao.update(slides);
	}
	
	



}
