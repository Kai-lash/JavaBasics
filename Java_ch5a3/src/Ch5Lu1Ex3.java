/* Print the series like 1, 1, 2, 3, 5...... 21, up to 10 places.
use only three integer variables.*/

/** @author KAILASH JOSHI*/

public class Ch5Lu1Ex3 {
	public static void main(String[] args) {
		int a = 1, b = 0, c = 0;

		for (int i = 0; i < 10; i++) {
			if (i == 0) {

				System.out.print(a + ", ");
			}

			c = a + b;
			b = a;
			a = c;
			System.out.print(c + ", ");

		}
	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */