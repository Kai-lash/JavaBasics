/*
Create a class called Product that has details such as product name, product 
quantity and unit price. Your program should store the record for 5 products 
and print the report in given format:
Product Name    Quantity in Hand  Unit Price  Total Value

Monitor            5               4000        20000
CPU               10              15000      150000

Calculate the Total Value.*/

/** @author KAILASH JOSHI*/

public class Product {
	String prodName = "";
	int quantity;
	float unitPrice;

	void setCustName(String prodName) {
		this.prodName = prodName;
	}

	void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	void dispCustDetail() {
		System.out.println(prodName + "           " + quantity
				+ "              " + unitPrice + "    " + quantity * unitPrice);
	}

	public static void main(String[] args) {
		Product product[] = new Product[5];
		for (int i = 0; i < product.length; i++) {
			product[i] = new Product();
		}
		product[0].setCustName("Mouse    ");
		product[0].setQuantity(10);
		product[0].setUnitPrice(5023);

		product[1].setCustName("Scanner  ");
		product[1].setQuantity(15);
		product[1].setUnitPrice(9045);

		product[2].setCustName("Printer  ");
		product[2].setQuantity(25);
		product[2].setUnitPrice(7822);

		product[3].setCustName("Hard Disk");
		product[3].setQuantity(20);
		product[3].setUnitPrice(5461);

		product[4].setCustName("RAM      ");
		product[4].setQuantity(12);
		product[4].setUnitPrice(4351);

		System.out
				.println("Product Name    Quantity in Hand  Unit Price  Total Value");
		System.out
				.println("---------------------------------------------------------");
		for (int i = 0; i < product.length; i++) {

			product[i].dispCustDetail();

		}
	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */

