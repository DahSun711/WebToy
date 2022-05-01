package ToyShop.Service.User;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import ToyShop.Dto.CartDto;
import ToyShop.Entity.Bills;

@Service
public interface IBillsService  {
	public int AddBills(Bills bill);
	
	public void AddBillsDetail(HashMap<Long, CartDto> carts);
}
