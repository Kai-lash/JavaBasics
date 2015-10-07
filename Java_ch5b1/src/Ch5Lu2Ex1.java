/*Using a "while" statement, calculate the product of the first eight natural
 numbers. (HINT - 1*2*3*4*5*6*7*8) */

/** @author KAILASH JOSHI*/
public class Ch5Lu2Ex1 {
	public static void main(String[] args) {
		int n = 1;
		int product = 1;
		while (n <= 8) {
			product = product * n;
			n++;
		}
		System.out.println("The product of the first 8 natural no is : "
				+ product);

	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */