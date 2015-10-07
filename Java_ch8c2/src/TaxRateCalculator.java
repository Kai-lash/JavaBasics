/* Create a class called TaxRateCalculator. It should have a method for calculating 
the tax on the passed in amount. The tax should be 10% of the passed value. Now, 
derive a class called IndiaRateCalculator. Override the method inherited from 
the base class and calculate the tax based on 15% of the passed amount.

Instantiate an object each of TaxRateCalculator and IndiaRateCalculator. Pass 
the same amount to the methods in both objects and display the returned value 
on the console to demonstrate that they are different.*/

/** @author KAILASH JOSHI*/

public class TaxRateCalculator

{
	double tax;

	void calculateTax(double amount) {
		tax = amount * 0.10;
		System.out.println("The tax for the specified amount is : " + tax);
	}

	public static void main(String[] args) {
		TaxRateCalculator taxCalculator = new TaxRateCalculator();
		taxCalculator.calculateTax(10000);

		IndiaRateCalculator indTaxcalculator = new IndiaRateCalculator();
		indTaxcalculator.calculateTax(10000);
	}
}

class IndiaRateCalculator extends TaxRateCalculator {
	void calculateTax(double amount) {
		tax = amount * 0.15;
		System.out.println("The tax for the specified amount is : " + tax);
	}
}
/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */