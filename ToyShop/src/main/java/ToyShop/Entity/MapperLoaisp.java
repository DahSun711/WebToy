package ToyShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperLoaisp implements RowMapper<Loaisp>{

	public Loaisp mapRow(ResultSet rs, int rowNum) throws SQLException {
		Loaisp loaisp = new Loaisp();
		loaisp.setMaloaisp(rs.getInt("maloaisp"));
		loaisp.setTenloaisp(rs.getString("tenloaisp"));
		return loaisp;
	}
	
}
