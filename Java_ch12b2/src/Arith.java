import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Write a class that has two methods, one for calculating the factorial of a given number 
 * and another for print Fibonacci Series from a given number.
 * From the main method accept a integer value from user and pass it to both methods.*/

/** @author KAILASH JOSHI*/
public class Arith {

	void factorial(int f) {

		int n = 1;
		int product = 1;
		while (n <= f) {
			product = product * n;
			n++;
		}
		System.out.println("Factorial of " + f + " is : " + product);
	}

	void fibonacci(int n) {
		System.out.println("Fibonacci series upto " + n + " places is : ");
		int a = 1, b = 0, c = 0;

		for (int i = 0; i < n; i++) {
			if (i == 0) {
				System.out.print(a + ", ");
			}
			c = a + b;
			b = a;
			a = c;
			System.out.print(c + ", ");
		}
	}

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		Arith math = new Arith();

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String StrNumber;
		int number;
		try {
			while (true) {
				StrNumber = bf.readLine();
				number = Integer.parseInt(StrNumber);
				System.out.println("Number entered by you : " + StrNumber);
				math.factorial(number);
				math.fibonacci(number);
			}

		} catch (NumberFormatException e) {
			System.out.println("Unknonw Number format !");

		} catch (Exception e) {
			System.out.println("Exception caught !");

		}

		bf.close();
	}
}
/*
 * After completing the exercise, you can submit it using the buttonprovided
 * inside the programming environment. You should find a button to do this on
 * the task bar.
 */