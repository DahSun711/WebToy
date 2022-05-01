package ToyShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ToyShop.Entity.Loaisp;
import ToyShop.Entity.MapperLoaisp;

@Repository
public class LoaispDao {
	@Autowired
	JdbcTemplate _jdbcTemplate;
	public List<Loaisp>	GetDataLoaisp(){
		List<Loaisp> list = new ArrayList<Loaisp>();
		String sql = "SELECT * FROM loaisp";
		list = _jdbcTemplate.query(sql, new MapperLoaisp());
		return list;
	}
}
