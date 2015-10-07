/* Write a program that includes a user defined exception. In the program, compare 
the salary of an employee according to the condition that if the salary is less 
than or equal to 10000, the user defined exception is thrown signifying that the 
employee is not eligible. Use a catch block to handle the exception.*/
/** @author KAILASH JOSHI*/
class MyException extends Exception {
	public MyException(String message) {
		super(message);
	}
}

public class Ch11Ex2 {
	public static void main(String[] args) {
		double empSalary = 9000;

		try {
			if (empSalary < 10000) {
				throw new MyException("Employee is not eligible !");
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
