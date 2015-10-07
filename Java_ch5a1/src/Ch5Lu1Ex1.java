/*Declare four integer variables and initialize them with values such as 
10, 20, 30 and 40 respectively. Now, determine the variable that has the 
highest value in this group of four variables. Print this value on the console.*/

/** @author KAILASH JOSHI*/

public class Ch5Lu1Ex1 {
	public static void main(String[] args) {
		int a = 10, b = 20, c = 30, d = 40;

		if (a > b) {
			if (a > c) {
				if (a > d) {
					System.out.println("Variable a has the highest value");

				} else {
					System.out.println("Variable d has the highest value");
				}
			} else if (c > d) {
				System.out.println("Variable c has the highest value");
			} else {
				System.out.println("Variable d has the highest value");
			}
		} else if (b > c) {
			if (b > d) {
				System.out.println("Variable b has the highest value");

			} else {
				System.out.println("Variable d has the highest value");
			}
		} else if (c > d) {
			System.out.println("Variable c has the highest value");
		} else {
			System.out.println("Variable d has the highest value");
		}
	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */