/*
Write a program with a class called Sales with data-members like invoice no., 
product code and quantity.   Supply methods for accepting data and displaying 
data. Also make sure that in the main method, you should not able to create more
 than one instance of this class. If one tries to create it, display a message 
saying "An instance is already running".*/

class Sales {
	static int count = 0;
	int invNo, prodCode, quantity;

	public Sales(int invNo, int prodCode, int quantity) {
		count++;
		if (count == 1) {
			this.invNo = invNo;
			this.prodCode = prodCode;
			this.quantity = quantity;
			display();
		} else {
			System.out.println("An Instance is already running");
		}
	}

	void display() {
		System.out.println("Invoice No.:" + invNo);
		System.out.println("Product Code :" + prodCode);
		System.out.println("Quantity :" + quantity);
	}
}

public class Ch7Ex2 {
	public static void main(String[] args) {
		Sales sale1 = new Sales(555, 756, 500);
		Sales sale2 = new Sales(550, 758, 50);
	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */
