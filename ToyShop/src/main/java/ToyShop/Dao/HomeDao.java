package ToyShop.Dao;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ToyShop.Entity.MapperSlides;
import ToyShop.Entity.Slides;

@Repository
public class HomeDao {
	@Autowired
	JdbcTemplate _jdbcTemplate;
	public List<Slides>	GetDataSlides(){
		List<Slides> list = new ArrayList<Slides>();
		String sql = "SELECT * FROM sanpham";
		list = _jdbcTemplate.query(sql, new MapperSlides());
		return list;
	}
	
	 public void save(Slides slides) {
		    String sql = "INSERT INTO sanpham (TENSP, GIA, MOTA, ANHBIA, MALOAISP) VALUES (?, ?, ?, ?, ?)";
		    _jdbcTemplate.update(sql, slides.getTensp(), slides.getGia(), slides.getMota(), slides.getAnhbia(), slides.getMaloaisp());
		  }
	 
	 public void delete(int id) {
		    String sql = "DELETE FROM sanpham WHERE MASP = " + id;
		    _jdbcTemplate.update(sql);
		  }
	 
	 public void update(Slides slides) {
		 String sql = "UPDATE sanpham SET TENSP = ?, GIA = ?, MOTA = ?, ANHBIA = ?, MALOAISP = ? WHERE MASP = ? ";
		    _jdbcTemplate.update(sql, slides.getTensp(), slides.getGia(), slides.getMota(), slides.getAnhbia(), slides.getMaloaisp());
	 }
	 
}
