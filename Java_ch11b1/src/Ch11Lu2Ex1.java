/*Declare an array of integers. Try to print the value of an index that is greater 
than the size of the array. Catch the resulting exception and display the message 
from the caught exception.*/

/** @author KAILASH JOSHI*/

public class Ch11Lu2Ex1 {
	public static void main(String[] args) {
		
		int[] int_array = new int[2];
		int_array[0] = 5;
		int_array[1] = 6;

		try {
			System.out.println("Third value in an array of integer is : "
					+ int_array[2]);
		} 
		catch (IndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBoundsException Exception Caught");
		} 
		catch (Exception e) {
			System.out.println("Exception Caught");
		}
	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */
