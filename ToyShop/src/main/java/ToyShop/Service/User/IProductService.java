package ToyShop.Service.User;



import java.util.List;

import org.springframework.stereotype.Service;

import ToyShop.Dto.SanPhamDto;

@Service
public interface IProductService {

	public SanPhamDto GetProductByID(long id);
	
	public List<SanPhamDto> GetProductByIDCategory(int id);
}
