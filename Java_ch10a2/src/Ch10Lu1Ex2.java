/* Write a program to read and write the details of an employee like year of joining, 
Department code, salary using some byte stream classes.*/

/** @author KAILASH JOSHI*/

import java.io.*;

public class Ch10Lu1Ex2 {
	public static void main(String[] args) throws IOException {
		int empYearOfJoining = 2012;
		String empDeptCode = "TG1";
		float empSalary = 25000;

		DataOutputStream output = new DataOutputStream(new FileOutputStream(
				"C:\\Users\\KAILASH\\Desktop\\Emp\\empOut.dat"));
		output.writeInt(empYearOfJoining);
		output.writeUTF(empDeptCode);
		output.writeFloat(empSalary);

		output.close();

		DataInputStream input = new DataInputStream(new FileInputStream(
				"C:\\Users\\KAILASH\\Desktop\\Emp\\empOut.dat"));
		System.out.println("The Output read from the file is :");
		System.out.println("Year of Joining : " + input.readInt());
		System.out.println("Employee Code : " + input.readUTF());
		System.out.println("employee Salary : " + input.readFloat());
	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */
