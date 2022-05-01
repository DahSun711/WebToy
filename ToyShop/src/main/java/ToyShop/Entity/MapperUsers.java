package ToyShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperUsers implements RowMapper<Users> {
	
	public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
		Users users = new Users();
		users.setHOTEN(rs.getString("HOTEN"));
		users.setNGAYSINH(rs.getString("NGAYSINH"));
		users.setDIACHI(rs.getString("DIACHI"));
		users.setSDT(rs.getString("SDT"));
		users.setTAIKHOAN(rs.getString("TAIKHOAN"));
		users.setMATKHAU(rs.getString("MATKHAU"));
		return users;
		
	}
}