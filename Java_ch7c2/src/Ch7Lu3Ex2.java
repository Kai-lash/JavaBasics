/* Write a java program with three variables var1, var2, and var3 of type double,
integer and long respectively. Find the highest value among var1, var2 and var3.
Print the cube of the highest value.*/

/** @author KAILASH JOSHI*/

public class Ch7Lu3Ex2 {
	public static void main(String[] args) {
		double var1 = 2.5;
		int var2 = 10;
		float var3 = 5.5f;

		if (var1 > var2) {
			if (var1 > var3) {
				System.out.println(var1
						+ " is the highest among the three variable.");
				System.out.println("And the cube of the "+var1+" is : " + var1 * var1
						* var1);
			} else {
				System.out.println(var3
						+ " is the highest among the three variable.");
				System.out.println("And the cube of the "+var3+" is : " + var3 * var3
						* var3);
			}
		} else if (var2 > (int) var3) {
			System.out.println(var2
					+ " is the highest among the three variable.");
			System.out.println("And the cube of the "+var2+" is : " + var2 * var2
					* var2);
		} else {
			System.out.println(var3
					+ " is the highest among the three variable.");
			System.out.println("And the cube of the "+var3+" is : " + var3 * var3
					* var3);
		}
	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */
