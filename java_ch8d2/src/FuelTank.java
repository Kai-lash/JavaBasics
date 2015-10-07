/* Create a class called FuelTank. Provide a final method for this class that displays 
the capacity of the tank and type of the fuel that it contains. Instantiate this class
and display the capacity and fuel type for this object on the console.*/

/** @author KAILASH JOSHI*/

public class FuelTank {
	final void dispTankDetails() {
		System.out
				.println("The capacity of the tank is 5000 lts and it contains Liquid fuel.");
	}

	public static void main(String[] args) {
		FuelTank fueltank = new FuelTank();
		fueltank.dispTankDetails();
	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */