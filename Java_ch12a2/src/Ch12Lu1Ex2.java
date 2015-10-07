/*Write a program to read an integer from the console. You need to determine 
if the integer is within the range of 0 to 5. For this, use assert statement. 
If it is not in the valid range, print assertion error message. Otherwise, 
print the valid output.*/

/** @author KAILASH JOSHI*/
import java.io.*;

public class Ch12Lu1Ex2 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String StrNumber;
		int number;
		try {
			while (true) {
				StrNumber = bf.readLine();
				number = Integer.parseInt(StrNumber);
				assert (number >= 0 && number <= 5);

				System.out.println("Number entered by you : " + number);
			}

		} catch (AssertionError e) {
			System.out
					.println("The entered number is not within the range of 0-5");
			e.printStackTrace();
		}
		bf.close();
	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */
