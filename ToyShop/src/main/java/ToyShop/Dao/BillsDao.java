package ToyShop.Dao;

import org.springframework.stereotype.Repository;

import ToyShop.Entity.BillDetail;
import ToyShop.Entity.Bills;

@Repository
public class BillsDao extends jdbcDao{
	
	
	public int AddBills (Bills bill)
	{
		StringBuffer  varname2 = new StringBuffer();
		varname2.append("INSERT INTO `dondathang` ");
		varname2.append("( ");
		varname2.append("`HOTEN`, ");
		varname2.append("`DIACHI`, ");
		varname2.append("`SDT`, ");
		varname2.append("`SOLUONG`, ");
		varname2.append("`DONGIA`) ");
		varname2.append("VALUES ");
		varname2.append("( ");
		varname2.append("	'"+bill.getHOTEN()+"', ");
		varname2.append("	'"+bill.getDIACHI()+"', ");
		varname2.append("	'"+bill.getSDT()+"', ");
		varname2.append("	'"+bill.getSOLUONG()+"', ");
		varname2.append("	'"+bill.getDONGIA()+"')");
		int ins = _jdbcTemplate.update(varname2.toString());
		return ins;
	}
	
	public long GetIDLastBills() {
		StringBuffer varname2 = new StringBuffer();
		varname2.append("SELECT MAX(MDDH) FROM dondathang;");
		long MDDH = _jdbcTemplate.queryForObject(varname2.toString(), new Object[] {}, Long.class);
		return MDDH;
	};
	
	public int AddBillsDetail(BillDetail billDetail) {
		StringBuffer  varname3 = new StringBuffer();
		varname3.append("INSERT INTO `ctdondathang` ");
		varname3.append("( ");
		varname3.append("    `MDDH`, ");
		varname3.append("    `MASP`, ");
		varname3.append("    `SOLUONG`, ");
		varname3.append("    `DONGIA`) ");
		varname3.append("VALUES ");
		varname3.append("( ");
		varname3.append("    '"+billDetail.getMDDH()+"', ");
		varname3.append("    '"+billDetail.getMASP()+"', ");
		varname3.append("    '"+billDetail.getSOLUONG()+"', ");
		varname3.append("    '"+billDetail.getDONGIA()+"')");
		int ins = _jdbcTemplate.update(varname3.toString());
		return ins;
	}
	
}
