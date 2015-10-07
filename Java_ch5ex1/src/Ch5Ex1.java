/*Determine all the even numbers between 1 and 100. Print these numbers 
on the console, one per line.*/

/** @author KAILASH JOSHI*/
public class Ch5Ex1 {
	public static void main(String[] args) {
		int a = 1;
		while (a < 100) {
			if (a % 2 == 0) {
				System.out.println(a + " is an even number.");

			}
			a++;
		}
	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */