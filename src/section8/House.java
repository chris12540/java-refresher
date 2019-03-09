package section8;

/**
 * CREATE THREE INSTANCE VARIABLES CALLED address(String), price(double), and
 * yearBuilt(int) AND ENCAPSULATE THEM. CREATE A MAIN METHOD THAT WILL
 * INSTANTIATE A HOUSE OBJECT AND SET THESE VARIABLES THROUGH SETTER METHODS.
 * THEN PRINT THESE VARIABLES USING THE GETTER METHODS
 */
public class House {
	
	public static void main(String[] args) {
		House house = new House();
		
		house.setAddress("3456, S Ellesmere Street");
		house.setPrice(250000);
		house.setYearBuilt(2010);
		
		System.out.println(house.toString());
	}
	
	private String address;
	
	private double price;
	
	private int yearBuilt;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getYearBuilt() {
		return yearBuilt;
	}

	public void setYearBuilt(int yearBuilt) {
		this.yearBuilt = yearBuilt;
	}

	@Override
	public String toString() {
		return "House [address=" + address + ", price=" + price + ", yearBuilt=" + yearBuilt + ", Memory Location=" +this.hashCode()+"]";
	}
	
}
