/* Write a program to compare names of two employees in a try block. If they do not 
match throw and catch a user defined exception.*/
/** @author KAILASH JOSHI*/
class MyException extends Exception {
	public MyException(String message) {
		super(message);
	}
}

public class Ch11Lu2Ex2 {

	public static void main(String[] args) {
		String empName1 = "Kailash";
		String empName2 = "Joshi";
		try {
			if (!empName1.equals(empName2)) {
				throw new MyException("Employee names do not match !");
			}
		} catch (MyException e) {
			System.out.println("User defined Exception caught !");
			System.out.println(e.getMessage());
		}
	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */
