package ToyShop.Dto;

public class CartDto {
	private int quanty;
	private float totalPrice;
	private SanPhamDto products;

	public CartDto(int quanty, float totalPrice, SanPhamDto products) {

		this.quanty = quanty;
		this.totalPrice = totalPrice;
		this.products = products;
	}

	public CartDto() {

	}

	public int getQuanty() {
		return quanty;
	}

	public void setQuanty(int quanty) {
		this.quanty = quanty;
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

	public SanPhamDto getProducts() {
		return products;
	}

	public void setProducts(SanPhamDto products) {
		this.products = products;
	}

}
