package ToyShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ToyShop.Entity.BillDetail;
import ToyShop.Entity.MapperSlides;
import ToyShop.Entity.Slides;

@Repository
public class BillDetailDao {
	@Autowired
	JdbcTemplate _jdbcTemplate;
	
	public List<BillDetail>	GetAllBillDetail(){
		List<BillDetail> list = new ArrayList<BillDetail>();
		String sql = "SELECT * FROM sanpham";
		list = _jdbcTemplate.query(sql, new MapperSlides());
		return list;
	}
}
