package ToyShop.Dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SanPhamDtoMapper implements RowMapper<SanPhamDto> {

	public SanPhamDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		SanPhamDto sanpham = new SanPhamDto();
		sanpham.setMasp(rs.getInt("masp"));
		sanpham.setTensp(rs.getString("tensp"));
		sanpham.setGia(rs.getFloat("gia"));
		sanpham.setMota(rs.getString("mota"));
		sanpham.setAnhbia(rs.getString("anhbia"));
		sanpham.setTenloaisp(rs.getString("tenloaisp"));
		sanpham.setMaloaisp(rs.getInt("maloaisp"));
		return sanpham;
	}

}
