/*
Create a class named ShippingPackage with data fields for weight in kilograms,
 shipping method, and shipping cost. The shipping method is a character: A for air,
 T for train, or M for mail. The ShippingPackage class contains a constructor that 
requires arguments for weight and shipping method. The constructor calls a private 
calculateCost() method that determines the shipping cost based on the following:

Shipping Method
shipping cost in the table Rs. per k.g.

Weight (kilograms) Air      Train      Mail

1 to 8             2.00     1.50       0.50

9 to 16            3.00     2.35       1.50

17 and over        4.50     3.25       2.15
 */

/** @author KAILASH JOSHI*/

public class ShippingPackage {

	float weight = 0;
	String shippingMethod;
	float shippingCost = 0;

	ShippingPackage(float weight, String shippingMethod) { // constructor
		this.weight = weight;
		this.shippingMethod = shippingMethod;

		shippingCost = calculateCoat(); // method call

		String shippingMethodName = shippingMethod.equals("A") ? "Air"
				: (shippingMethodName = shippingMethod.equals("M") ? "Mail"
						: "Train");
		System.out.println("The Shipping cost for " + weight
				+ " Kg and shipping method " + shippingMethodName + " is "
				+ shippingCost + " Rs.");
	}

	private float calculateCoat() {
		if (weight >= 1 && weight <= 8 && (shippingMethod.equals("A"))) {
			shippingCost = 2.00f;
		} else if (weight >= 9 && weight <= 16 && (shippingMethod.equals("A"))) {
			shippingCost = 3.00f;
		} else if (weight >= 17 && (shippingMethod.equals("A"))) {
			shippingCost = 4.50f;
		} else if (weight >= 1 && weight <= 8 && (shippingMethod.equals("T"))) {
			shippingCost = 1.50f;
		} else if (weight >= 9 && weight <= 16 && (shippingMethod.equals("T"))) {
			shippingCost = 2.35f;
		} else if (weight >= 1 && (shippingMethod.equals("T"))) {
			shippingCost = 3.25f;
		} else if (weight >= 1 && weight <= 8 && (shippingMethod.equals("M"))) {
			shippingCost = 0.50f;
		} else if (weight >= 9 && weight <= 16 && (shippingMethod.equals("M"))) {
			shippingCost = 1.50f;
		} else if (weight >= 17 && (shippingMethod.equals("M"))) {
			shippingCost = 2.15f;
		}
		return shippingCost;
	}

	public static void main(String[] args) {
		ShippingPackage shipping = new ShippingPackage(4, "M");
	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */
