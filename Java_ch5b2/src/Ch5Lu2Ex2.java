/* Write a Java program to print the table of the number 99 up to 10. 
This table should be arrived at using a loop.*/

/** @author KAILASH JOSHI*/
public class Ch5Lu2Ex2 {
	public static void main(String[] args) {
		int a = 1;
		int cont_no = 99;
		int product = 1;
		System.out.println("The table of 99 upto 10 is given below :");
		System.out.println();
		while (a <= 10) {
			product = cont_no * a;
			System.out.println(cont_no + " x " + a + " = " + product);
			a++;
		}
	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */