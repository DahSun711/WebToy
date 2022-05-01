package ToyShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ToyShop.Dao.SanPhamDao;
import ToyShop.Dto.SanPhamDto;

@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	SanPhamDao sanphamDao = new SanPhamDao();

	public SanPhamDto GetProductByID(long id) {
		List<SanPhamDto> listProduct = sanphamDao.GetProductByID(id);
		return listProduct.get(0);
	}

	public List<SanPhamDto> GetProductByIDCategory(int id) {
		sanphamDao.GetAllSanPhamByID(id);
		return sanphamDao.GetAllSanPhamByID(id);
	}

}
