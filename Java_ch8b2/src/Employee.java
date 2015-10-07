/* Create an interface called ISeniorEmployee. It should have a member variable 
to represent the employee grade - SENIOR.
Instantiate the class that you have created and display the employee type on 
the console, for the created object.*/

/** @author KAILASH JOSHI*/

import java.util.Calendar;

public class Employee implements ISeniorEmployee {

	public void showEmpType() {
		System.out.println("The Employee Grade for this employee is : "
				+ empGrade);
	}

	public static void main(String[] args) {
		Employee employee = new Employee();
		ISeniorEmployee Isenior;
		Isenior = employee;
		Isenior.showEmpType();
	}
}

interface ISeniorEmployee { // Interface
	String empGrade = "SENIOR";

	void showEmpType();
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */

