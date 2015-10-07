import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/* In a random access file, first write the alphabets a,b, c, d till z. Read the file
 in reverse order and print it on screen.*/

/** @author KAILASH JOSHI*/

public class Ch10Lu2Ex2 {
	public static void main(String[] args) throws IOException {
		// char i=97;
		int i = 97;
		DataOutputStream outputf = new DataOutputStream(new FileOutputStream(
				"C:\\Users\\KAILASH\\Desktop\\Emp\\alphabet.dat"));

		RandomAccessFile output = new RandomAccessFile(
				"C:\\Users\\KAILASH\\Desktop\\Emp\\alphabet.dat", "rw");

		System.out.println("Alphabets written to the file are : ");

		for (i = 97; i < 123; i++) {
			output.writeChar(i);
			System.out.print((char) i + " ");
		}

		System.out.println();
		System.out.println("Alphabets read from the file are : ");

		for (i = (int) output.length() - 2; i >= 0; i = i - 2) {
			output.seek(i);
			System.out.print(output.readChar() + " ");
		}
		output.close();
	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */
