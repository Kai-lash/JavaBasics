import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*Write a program that stores the names of four employees in an array of strings. 
 Store the contents of the array in an alphabetical order in a file and display it back on 
 console. Do not use the RandomAccessFile class*/

/** @author KAILASH JOSHI*/

public class Ch10Ex1 {
	public static void main(String[] args) throws IOException {
		String temp = "";
		String[] empName = new String[4];
		empName[0] = "Sunil";
		empName[1] = "Anoj";
		empName[2] = "Akash";
		empName[3] = "Gaurav";

		for (int j = 0; j < empName.length - 1; j++) {
			for (int i = 0; i < empName.length - 1; i++) {
				if (empName[i].compareTo(empName[i + 1]) > 0) {
					temp = empName[i];
					empName[i] = empName[i + 1];
					empName[i + 1] = temp;
				}
			}
		}

		DataOutputStream output = new DataOutputStream(new FileOutputStream(
				"C:\\Users\\KAILASH\\Desktop\\Emp\\emp.dat"));
		for (int i = 0; i < empName.length; i++) {
			output.writeUTF(empName[i]);
		}

		output.close();

		DataInputStream input = new DataInputStream(new FileInputStream(
				"C:\\Users\\KAILASH\\Desktop\\Emp\\emp.dat"));
		for (int i = 0; i < empName.length; i++) {

			System.out.println(input.readUTF());
		}
	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */
