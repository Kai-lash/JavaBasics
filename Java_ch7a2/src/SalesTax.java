/* Create a class SalesTax with 3 member variables namely Customer name, total 
sales and Sales Tax. Create two methods namely get () and print (). The method 
get () should retrieve the values of name and the total sales. It should calculate
 tax as 8% of total sales. The method print () should print these members' values.*/

/** @author KAILASH JOSHI*/

public class SalesTax {
	String custName = "Ravikant";
	float totSales = 25000;
	float salesTax;
	float salesTaxRate = 4;

	String getCustName() {
		return custName;
	}

	float getTotSales() {

		return totSales;
	}

	float getSalesTax() {
		salesTax += totSales * 0.08;
		return salesTax;
	}

	void print() {
		getSalesTax();
		System.out.println(custName + "          " + salesTax + "        "
				+ totSales);
	}

	public static void main(String[] args) {
		SalesTax salesTax = new SalesTax();
		System.out.println("Customer Name     Sales Tax     Total Sales ");
		System.out.println("-------------------------------------------");
		salesTax.print();
	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */
