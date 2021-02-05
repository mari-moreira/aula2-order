package entities;

public class OrderItem {
//Atributos
	private Integer quantity;
	private Double price;
	private Product product;

	// Construtores

	public OrderItem() {

	}

	public OrderItem(Integer quantity, Double price, Product product) {

		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	// Métodos gets e sets

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	// Método sub Total

	public Double subTotal() {
		return this.quantity * this.price;
	}

	// Método toString
	@Override
	public String toString() {

		return getProduct().getName() 
				+ ", $" 
				+String.format("%.2f", price) 
				+ ", Quantity: " 
				+ quantity 
				+ ", "
				+ "Subtotal : $" 
				+ subTotal();
	}

}
