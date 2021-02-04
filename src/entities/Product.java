package entities;

public class Product {
	// Atributos
	private String name;
	private Double price;

	// Construtores
	public Product() {

	}

	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}
	// Métodos gets e sets

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
