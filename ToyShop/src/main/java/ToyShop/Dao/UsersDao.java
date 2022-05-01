package ToyShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import ToyShop.Entity.MapperUsers;
import ToyShop.Entity.Users;

@Repository
public class UsersDao extends jdbcDao{
	public int AddAccount(Users user) {				
		
		StringBuffer sql = new StringBuffer();
		sql.append("INSERT ");
		sql.append("INTO ");
		sql.append("user ");
		sql.append("( ");
		sql.append("	HOTEN, ");
		sql.append("	NGAYSINH, ");
		sql.append("	DIACHI, ");
		sql.append("	SDT, ");
		sql.append("	TAIKHOAN, ");
		sql.append("	MATKHAU ");
		sql.append(") ");
		sql.append("VALUES ");
		sql.append("( ");
		sql.append("	'"+user.getHOTEN()+"', ");
		sql.append("	'"+user.getNGAYSINH()+"', ");
		sql.append("	'"+user.getDIACHI()+"', ");
		sql.append("	'"+user.getSDT()+"', ");
		sql.append("	'"+user.getTAIKHOAN()+"', ");
		sql.append("	'"+user.getMATKHAU()+"' ");
		sql.append(")"); 
		int insert = _jdbcTemplate.update(sql.toString()) ;
		return insert;
		
	}
	
	public Users GetUserByAccount(Users user) {				
		
		String sql = "SELECT * FROM user WHERE TAIKHOAN = '"+user.getTAIKHOAN()+"'";
		Users kq = _jdbcTemplate.queryForObject(sql, new MapperUsers());
		return kq;
		
	}
	
	
	public List<Users> GetDataUser(){
		List<Users> listUser = new ArrayList<Users>();
		String sql = "SELECT * FROM user";
		listUser = _jdbcTemplate.query(sql, new MapperUsers());
		return listUser;
		
	}

	
}
