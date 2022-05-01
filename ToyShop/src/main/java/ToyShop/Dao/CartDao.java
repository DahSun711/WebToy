package ToyShop.Dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ToyShop.Dto.CartDto;
import ToyShop.Dto.SanPhamDto;

@Repository
public class CartDao {
	@Autowired
	JdbcTemplate _jdbcTemplate;

	@Autowired
	SanPhamDao sanphamDao = new SanPhamDao();

	public HashMap<Long, CartDto> AddCart(long id, HashMap<Long, CartDto> cart) {
		CartDto itemCart = new CartDto();
		SanPhamDto sanpham = sanphamDao.FindProductByID(id);
		if (sanpham != null && cart.containsKey(id)) {
			itemCart = cart.get(id);
			itemCart.setQuanty(itemCart.getQuanty()+1);
			itemCart.setTotalPrice(itemCart.getQuanty() * itemCart.getProducts().getGia());
		}
		else {
			itemCart.setProducts(sanpham);
			itemCart.setQuanty(1);
			itemCart.setTotalPrice(sanpham.getGia());
		}
		cart.put(id, itemCart);
		return cart;

	}

	public HashMap<Long, CartDto> EditCart(long id, int quanty, HashMap<Long, CartDto> cart) {
		if (cart == null) {
			return cart;
		}
		CartDto itemCart = new CartDto();
		if (cart.containsKey(id)) {
			itemCart = cart.get(id);
			itemCart.setQuanty(quanty);
			float totalPrice = quanty * itemCart.getProducts().getGia();
			itemCart.setTotalPrice(totalPrice);
		}
		cart.put(id, itemCart);
		return cart;

	}

	public HashMap<Long, CartDto> DeleteCart(long id, HashMap<Long, CartDto> cart) {
		if (cart == null) {
			return cart;
		}
		if (cart.containsKey(id)) {
			cart.remove(id);
		}
		return cart;

	}
	
	public int TotalQuanty(HashMap<Long, CartDto> cart) {
		int totalQuanty = 0;
		for(Map.Entry<Long, CartDto> itemCart : cart.entrySet()) {
			totalQuanty += itemCart.getValue().getQuanty();
		}
		return totalQuanty;
	}
	
	public float Totalprice(HashMap<Long, CartDto> cart) {
		int totalPrice = 0;
		for(Map.Entry<Long, CartDto> itemCart : cart.entrySet()) {
			totalPrice += itemCart.getValue().getTotalPrice();
		}
		return totalPrice;
	}
}
