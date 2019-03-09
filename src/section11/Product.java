package section11;

import java.util.ArrayList;

public class Product {
	
	private String name;
	
	Product(String name) {
		this.name = name;
	}
	
	public float getPrice() {
		return 40.0f;
	}
	
	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<Product>();
		
		Shirt s1 = new Shirt("Gap", "small");
		Shirt s2 = new Shirt("Old Navy", "medium");
		OfficeSupply os1 = new OfficeSupply("marker", false);
		OfficeSupply os2 = new OfficeSupply("stapler", true);
		Toy t1 = new Toy("Buzz");
		
		products.add(s1);
		products.add(s2);
		products.add(os1);
		products.add(os2);
		products.add(t1);
		
		float total = 0.0f;
		
		for(Product product: products) {
			total+= product.getPrice();
		}
		
		System.out.println("Total price: "+total);
	}
	
}

class Shirt extends Product {
	
	private String size;
	
	Shirt(String name, String size) {
		super(name);
		this.size = size;
	}
	
	@Override
	public float getPrice() {
		if(size.equals("small"))
			return 17.0f;
		else
			return 23.0f;
	}
}

class OfficeSupply extends Product {
	
	private boolean isUsed;
	
	OfficeSupply(String name, boolean isUsed) {
		super(name);
		this.isUsed = isUsed;
	}
	
	@Override
	public float getPrice() {
		if(isUsed)
			return 24.0f;
		else
			return 30.0f;
	}
}

class Toy extends Product {
	Toy(String name) {
		super(name);
	}
}
