/* Write a program that stores the names of four employees in an array of strings.  
Display the contents of the array in an alphabetical order.*/

/** @author KAILASH JOSHI*/

public class Ch9Lu1Ex1 {
	public static void main(String[] args) {
		String[] empName = new String[4];
		String temp;
		empName[0] = "Sachin";
		empName[1] = "David";
		empName[2] = "Ricky";
		empName[3] = "Mahesh";

		for (int j = 0; j < empName.length - 1; j++) {
			for (int i = 0; i < empName.length - 1; i++) {
				if (empName[i].compareTo(empName[i + 1]) > 0) {
					temp = empName[i];
					empName[i] = empName[i + 1];
					empName[i + 1] = temp;
				}
			}
		}
		for (int i = 0; i < empName.length; i++) {
			System.out.println("" + empName[i]);
		}
	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */
