/* Create a package called Utilities. Add a class called Employee to this package. 
 Add members and methods for accessing the employee's id, name and salary. Display 
 this data on the console.*/

/** @author KAILASH JOSHI*/

package utilities;

public class Employee {
	int empId = 101;
	String empName = "Kailash Joshi";
	float empSal = 25000;

	String getEmpName() {
		return empName;
	}

	float getEmpSal() {
		return empSal;
	}

	int getEmpId() {
		return empId;
	}

	public static void main(String[] args) {

		Employee employee = new Employee();

		System.out.println("Employee name : " + employee.getEmpName());
		System.out.println("Employee ID : " + employee.getEmpId());
		System.out.println("Employee Salary : " + employee.getEmpSal());
	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */

