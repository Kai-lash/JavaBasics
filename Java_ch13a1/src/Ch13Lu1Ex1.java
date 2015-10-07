/** @author KAILASH JOSHI*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;


/*Prompt the user to enter the name of a text file to search for.
 * If the name does not end in a .txt extension, display an error message.
 * Search for this file in the current directory. If the file does not exist
 * print a message that says so.*/

class MyException extends Exception {
	public MyException(String message) {
		super(message);
	}
}

public class Ch13Lu1Ex1 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String StrFileName;
		String[] StrFileNameTemp;
		int number;
		try {
			while (true) {
				StrFileName = bf.readLine();

				StrFileNameTemp = StrFileName.split("[.]");
				if (StrFileNameTemp.length == 1) {
					throw new MyException(
							"Please mention the file name correctly with extention !");
				}

				if (!StrFileNameTemp[1].equals("txt")) {
					throw new MyException("This is not a valid .txt file !");
				}

				File f = new File("../Java_ch13a1/src/" + StrFileName);

				if (f.exists()) {
					System.out.println("File : " + StrFileName + " exists.");
				} else {
					throw new MyException("No such file found !");
				}
			}

		}

		catch (MyException e) {
			System.out.println("User defined Exception caught !");
			System.out.println(e.getMessage());
		}
		bf.close();
	}

}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */