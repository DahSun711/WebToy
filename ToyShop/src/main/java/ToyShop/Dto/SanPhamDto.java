package ToyShop.Dto;

public class SanPhamDto {
	private int masp;
	private String tensp;
	private float gia;
	private String mota;
	private String anhbia;
	private String tenloaisp;
	private int maloaisp;
	
	public SanPhamDto() {
		super();
	}
	public int getMasp() {
		return masp;
	}
	public void setMasp(int masp) {
		this.masp = masp;
	}
	public String getTensp() {
		return tensp;
	}
	public void setTensp(String tensp) {
		this.tensp = tensp;
	}
	public float getGia() {
		return gia;
	}
	public void setGia(float gia) {
		this.gia = gia;
	}
	public String getMota() {
		return mota;
	}
	public void setMota(String mota) {
		this.mota = mota;
	}
	public String getAnhbia() {
		return anhbia;
	}
	public void setAnhbia(String anhbia) {
		this.anhbia = anhbia;
	}
	public String getTenloaisp() {
		return tenloaisp;
	}
	public void setTenloaisp(String tenloaisp) {
		this.tenloaisp = tenloaisp;
	}
	public int getMaloaisp() {
		return maloaisp;
	}	
	public void setMaloaisp(int maloaisp) {
		this.maloaisp = maloaisp;
	}
}
