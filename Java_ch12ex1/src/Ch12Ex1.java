/** @author KAILASH JOSHI*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Write a program which should accept the employee code from user and validate it according to the 
 * following logic. The first character of the employee code should be the letter 'E'. If it is
 * any other letter, throw a user defined exception that displays an appropriate error message.*/

class MyException extends Exception {
	public MyException(String message) {
		super(message);
	}
}

public class Ch12Ex1 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String StrNumber;
		int number;
		try {
			while (true) {
				StrNumber = bf.readLine();
				// number = Integer.parseInt(StrNumber);
				if (!StrNumber.startsWith("E")) {
					throw new MyException(
							"Employee code does not starts with 'E' !");
				}

				System.out.println("Employee code entered by you : "
						+ StrNumber);
			}

		} catch (MyException e) {
			System.out.println("User defined Exception caught !");
			System.out.println(e.getMessage());
		}
		bf.close();
	}
}
/*
 * After completing the exercise, you can submit it using the buttonprovided
 * inside the programming environment. You should find a button to do this on
 * the task bar.
 */