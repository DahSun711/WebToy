package ToyShop.Service.User;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ToyShop.Dao.BillsDao;
import ToyShop.Dto.CartDto;
import ToyShop.Entity.BillDetail;
import ToyShop.Entity.Bills;

@Service
public class BillsServiceImpl implements IBillsService {
	@Autowired
	private BillsDao billsDao;
	
	public int AddBills(Bills bill) {
		return billsDao.AddBills(bill);
	}

	public void AddBillsDetail(HashMap<Long, CartDto> carts) {
		long idBill = billsDao.GetIDLastBills();
		
		for(Map.Entry<Long, CartDto> itemCart : carts.entrySet()) {
			BillDetail billDetail = new BillDetail();
			billDetail.setMDDH(idBill);
			billDetail.setMASP(itemCart.getValue().getProducts().getMasp());
			billDetail.setSOLUONG(itemCart.getValue().getQuanty());
			billDetail.setDONGIA(itemCart.getValue().getTotalPrice());
			billsDao.AddBillsDetail(billDetail);
		}
	}	
}
