
public class Product {
	String productName;
	double price;
	static int totalProduct = 0;

	public Product(String productName, double price) {
		this.productName = productName;
		this.price = price;
		totalProduct++;
	}

	public void displayProductDetails() {
		System.out.printf("Product name: %s%nPrice: %.2f%n", productName, price);
	}

	public static void displayTotalProducts() {
		System.out.printf("Total number of products: %d%n", totalProduct);
	}

	public static void main(String[] args) {
		Product p1 = new Product("Laptop", 55000);
		Product p2 = new Product("Mobile", 25000);
		p1.displayProductDetails();
		System.out.println();
		p2.displayProductDetails();
		Product.displayTotalProducts();
	}
}
