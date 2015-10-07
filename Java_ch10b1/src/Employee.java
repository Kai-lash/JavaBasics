import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/* Write a program to write the details of an employee to a file. Details such as year of 
 joining, department code, employee name and salary should be included. You must use 
 RandomAccessFile to accomplish this. Now, read the data that has been written in the 
 previous step and display it on the console. Using the seek pointer, retrieve the 
 employee name and display it.*/

/** @author KAILASH JOSHI*/

public class Employee {
	public static void main(String[] args) throws IOException {
		int empYearOfJoining = 2012;
		String empDeptCode = "TG1";
		String empName = "Kailash";
		float empSalary = 25000;

		RandomAccessFile output = new RandomAccessFile(
				"C:\\Users\\KAILASH\\Desktop\\Emp\\empOut.dat", "rw");
		output.writeInt(empYearOfJoining);
		output.writeUTF(empDeptCode);
		output.writeUTF(empName);
		output.writeFloat(empSalary);

		output.seek(0);

		System.out.println("The Output read from the file is :");
		System.out.println("Year of Joining : " + output.readInt());
		System.out.println("Employee Code : " + output.readUTF());
		System.out.println("Employee Name : " + output.readUTF());
		System.out.println("Employee Salary : " + output.readFloat());
		System.out.println("length : " + output.length());
		output.seek(18);
		System.out.println("Employee Name : " + output.readFloat());

		output.close();
	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */

