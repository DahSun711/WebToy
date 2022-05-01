package ToyShop.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import ToyShop.Dto.SanPhamDto;

@Service
public interface ISanPhamService {

	public List<SanPhamDto> GetAllSanPhamByID(int id);

	public List<SanPhamDto> GetDataSanPhamPaginate(int id, int start, int end);

}
