/* Create a package Utilities which should have a class HelpInt. This class should 
have method to calculate square root of a given integer value and square of given 
value Test your package by value 27 and 9.*/

/** @author KAILASH JOSHI*/

import utilities.HelpInt;   

/* Following is the HelpInt class defined in the utilities package.
 * 
 *  public class HelpInt {

	double sqrt = 0, sqr = 0;

	public double calcSqrt(double number) {
		sqrt = Math.sqrt(number);
		return sqrt;
	}

	public double calcSqr(double number) {
		sqr = number * number;
		return sqr;
	}
}*/

public class Ch9Ex1 {
	public static void main(String[] args) {
		HelpInt help = new HelpInt();

		System.out.println("The square of 27 is : " + help.calcSqr(27));
		System.out.println("The square root of 27 is : " + help.calcSqrt(27));

		System.out.println("The square of 9 is : " + help.calcSqr(9));
		System.out.println("The square root of 9 is : " + help.calcSqrt(9));
	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */

