package ArrayList;

import java.util.*;
class Product {
	private int id;
	private String name;

	public Product() {

	}

	public Product(String name, int id, float price) {
		this.name = name;
		this.id = id;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	private float price;
}
public class GenApplication {
	public static void main(String[] args) {
		ArrayList<Product> al = new ArrayList<Product>();
		al.add(new Product("ABC", 1, 1000.0f));
		al.add(new Product("MNO", 2, 2000.0f));
		al.add(new Product("PQR", 3, 3000.0f));
		float sum = 0;
		for (Product p : al) {
			sum = sum + p.getPrice();
		}
		System.out.println("Sum of all product price " + sum);

	}
}
