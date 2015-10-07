/*
 * Write a Java application that contains a method that computes the final price for a sales
 transaction. The main() method contains variables that hold the price of an item, the
 salesperson's commission expressed as a percentage, and the customer discount expressed as a
 percentage. Create a calculation() method that determines the final price and returns the value
 to the calling method. The calculation() method requires three arguments: product price,
 salesperson commission rate, and customer discount rate. A product's final price is the original
 price plus the commission amount minus the discount amount; the customer discount is taken as
 a percentage of the total price after the salesperson commission has been added to the original
 */

/** @author KAILASH JOSHI*/

public class Sales {
	static float totalPrice = 0;

	public static void main(String[] args) {
		float itemPrice = 2000;
		float commission = 10;
		float discount = 5;
		Sales sales = new Sales();
		totalPrice = sales.calculation(itemPrice, commission, discount);
		System.out.println("The final price of the item is : " + totalPrice);

	}

	float calculation(float itemPrice, float commission, float discount) {
		totalPrice = (float) ((itemPrice + itemPrice * commission * 0.01) - itemPrice
				* discount * 0.01);
		return totalPrice;
	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */
