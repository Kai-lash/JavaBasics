/*Write a program to calculate the sum of first five natural numbers.
 * As the second part of this exercise, generate a Harmonic Series, as illustrated
 * in the following example.
 *  Input - 5
 *  Output - 1 + 1/2 + 1/3 + 1/4 + 1/5 = 2.28 (Approximately)
 *  Also set breakpoints at appropriate
 *  lines and check the intermediate results in the debug mode.
 */

/** @author KAILASH JOSHI*/

public class Ch12Ex2 {
	int sum = 0;
	float harmSeriesSum = 0;
	String harmSeries = "";

	void calcSum() {
		for (int i = 1; i <= 5; i++) {
			sum += i;
		}
		System.out
				.println("The sum of the first 5 natural numbers is : " + sum);
	}

	void genHarmonic(int n) {
		for (float i = 1; i <= n; i++) {

			harmSeriesSum = harmSeriesSum + (1 / i);

			harmSeries += "1/" + i + " + ";
			if (i == 5) {
				harmSeries += "1/" + i;
			}
		}
		System.out.println(harmSeries + " = " + harmSeriesSum);
	}

	public static void main(String[] args) {
		Ch12Ex2 math = new Ch12Ex2();
		math.calcSum();
		math.genHarmonic(5);

	}

}
/*
 * After completing the exercise, you can submit it using the buttonprovided
 * inside the programming environment. You should find a button to do this on
 * the task bar.
 */