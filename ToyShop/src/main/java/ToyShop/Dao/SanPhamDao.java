package ToyShop.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ToyShop.Dto.SanPhamDto;
import ToyShop.Dto.SanPhamDtoMapper;

@Repository
public class SanPhamDao {

	private StringBuffer SqlString() {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT s.MASP, ");
		sql.append("		s.TENSP, ");
		sql.append("        s.GIA, ");
		sql.append("       	s.MOTA, ");
		sql.append("        s.ANHBIA, ");
		sql.append("        s.MALOAISP, ");
		sql.append("        l.MALOAISP, ");
		sql.append("        l.TENLOAISP ");
		sql.append("        FROM sanpham as s ");
		sql.append("        INNER JOIN ");
		sql.append("        loaisp as l ");
		sql.append("        on s.MALOAISP=l.MALOAISP ");
		return sql;
	}

	private String SqlProducts() {
		StringBuffer sql = SqlString();
		sql.append("        ORDER by rand()");
		sql.append("        LIMIT 8");
		return sql.toString();
	}

	private StringBuffer SqlProductsByID(int id) {
		StringBuffer sql = SqlString();
		sql.append("WHERE 1 = 1 ");
		sql.append("and s.MALOAISP = " + id + " ");
		return sql;
	}

	private String SqlProductsPaginate(int id, int start, int totalPage) {
		StringBuffer sql = SqlProductsByID(id);
		sql.append("LIMIT " + (start - 1) + ", " + totalPage);
		return sql.toString();
	}

	@Autowired
	JdbcTemplate _jdbcTemplate;

	public List<SanPhamDto> GetDataSanPham() {
		String sql = SqlProducts();
		List<SanPhamDto> listSanPham = _jdbcTemplate.query(sql, new SanPhamDtoMapper());
		return listSanPham;
	}

	public List<SanPhamDto> GetAllSanPhamByID(int id) {
		String sql = SqlProductsByID(id).toString();
		List<SanPhamDto> listSanPham = _jdbcTemplate.query(sql, new SanPhamDtoMapper());
		return listSanPham;
	}

	public List<SanPhamDto> GetDataSanPhamPaginate(int id, int start, int totalPage) {
		String sql = SqlProductsPaginate(id, start, totalPage);
		List<SanPhamDto> listSanPham = _jdbcTemplate.query(sql, new SanPhamDtoMapper());
		return listSanPham;
	}

	private String SqlProductByID(long id) {
		StringBuffer sql = SqlString();
		sql.append("WHERE 1 = 1 ");
		sql.append("AND MASP = " + id + " ");
		sql.append("LIMIT 1 ");
		return sql.toString();
	}
	public List<SanPhamDto> GetProductByID(long id) {
		String sql = SqlProductByID(id);
		List<SanPhamDto> Product = _jdbcTemplate.query(sql, new SanPhamDtoMapper());
		return Product;
	}
	
	public SanPhamDto FindProductByID(long id) {
		String sql = SqlProductByID(id);
		SanPhamDto Product = _jdbcTemplate.queryForObject(sql, new SanPhamDtoMapper());
		return Product;
	}
}
