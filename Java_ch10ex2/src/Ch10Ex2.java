import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 Write a program to use a File object and print even numbers from two to ten. 
 Then using RandomAccessFile write numbers from 1 to 5. Then using seek () print
 only the last 3 digits.*/

/** @author KAILASH JOSHI*/

public class Ch10Ex2 {

	public static void main(String[] args) throws IOException {

		File test = new File("C:\\Users\\KAILASH\\Desktop\\Emp\\test.txt");
		DataOutputStream f = new DataOutputStream(new FileOutputStream(test));
		System.out.println("The digits written to the file are : ");

		for (int i = 2; i <= 10; i = i + 2) {
			f.writeInt(i);
			System.out.println(i);
		}

		RandomAccessFile output = new RandomAccessFile(
				"C:\\Users\\KAILASH\\Desktop\\Emp\\test.txt", "rw");

		for (int i = 1; i <= 5; i++) {
			output.seek(output.length());
			output.writeInt(i);
			System.out.println(i);
		}

		System.out.println("The last 3 digits read from the file is : ");

		for (int i = 3; i > 0; i--) {
			output.seek(output.length() - 4 * i);
			System.out.println(output.readInt());
		}
		output.close();
	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */
