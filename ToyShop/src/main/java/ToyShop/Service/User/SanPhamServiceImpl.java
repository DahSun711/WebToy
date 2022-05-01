package ToyShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ToyShop.Dao.SanPhamDao;
import ToyShop.Dto.SanPhamDto;

@Service
public class SanPhamServiceImpl implements ISanPhamService {

	@Autowired
	private SanPhamDao sanphamDao;

	public List<SanPhamDto> GetAllSanPhamByID(int id) {
		return sanphamDao.GetAllSanPhamByID(id);
	}

	public List<SanPhamDto> GetDataSanPhamPaginate(int id, int start, int totalPage) {
		return sanphamDao.GetDataSanPhamPaginate(id, start, totalPage);
	}


	
}
