package ToyShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperSlides implements RowMapper<Slides>{

	public Slides mapRow(ResultSet rs, int rowNum) throws SQLException {
		Slides slides = new Slides();
		slides.setMasp(rs.getInt("masp"));
		slides.setTensp(rs.getString("tensp"));
		slides.setGia(rs.getFloat("gia"));
		slides.setMota(rs.getString("mota"));
		slides.setAnhbia(rs.getString("anhbia"));
		slides.setMaloaisp(rs.getInt("maloaisp"));
		return slides;
	}
	
}
