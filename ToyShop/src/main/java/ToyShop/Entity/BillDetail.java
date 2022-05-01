package ToyShop.Entity;

public class BillDetail {
	private long MDDH;
	private int MASP;
	private int SOLUONG;
	private double DONGIA;
	
	public BillDetail() {
		super();
	}
	
	public long getMDDH() {
		return MDDH;
	}

	public void setMDDH(long mDDH) {
		MDDH = mDDH;
	}

	public int getMASP() {
		return MASP;
	}
	public void setMASP(int mASP) {
		MASP = mASP;
	}
	public int getSOLUONG() {
		return SOLUONG;
	}
	public void setSOLUONG(int sOLUONG) {
		SOLUONG = sOLUONG;
	}
	public double getDONGIA() {
		return DONGIA;
	}
	public void setDONGIA(double dONGIA) {
		DONGIA = dONGIA;
	}
	
}
