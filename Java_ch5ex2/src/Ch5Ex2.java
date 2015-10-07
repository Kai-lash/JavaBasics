/* Write a program to determine all numbers between 100 and 200 which 
are multiples of the number 7. Print the count of such numbers followed 
by their values.*/
/** @author KAILASH JOSHI*/
public class Ch5Ex2 {
	public static void main(String[] args) {
		int a = 100;
		int count = 0;
		while (a < 200) {
			if (a % 7 == 0) {

				count++;
				System.out.println(count + " - " + a + " is a multiple of 7.");
			}
			a++;

		}
		System.out.println("There are total " + count
				+ " multiples of 7 between 100 and 200.");
	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */