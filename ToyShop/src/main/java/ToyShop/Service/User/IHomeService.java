package ToyShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ToyShop.Dto.SanPhamDto;
import ToyShop.Entity.Loaisp;
import ToyShop.Entity.Slides;
import ToyShop.Entity.Users;

@Service
public interface IHomeService {
	@Autowired
	public List<Slides>	GetDataSlides();
	public List<Loaisp> GetDataLoaisp();

	public List<SanPhamDto> GetDataSanPham();
	
	public List<Users> GetDataUser();
	
	public void save(Slides slides);
	
	public void update(Slides slides);
}
