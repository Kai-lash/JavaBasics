/* Create an interface that contains a method for adding the salary amount to a
 person's account balance. Create another interface that contains a method which 
when implemented should deduct 25% as the tax amount from an employee's salary.  
Create an Employee class with details such as name and salary. Create a new sub 
class that derives from this class and implements the two interfaces. Instantiate 
this sub class and display the employee name, salary, salary after tax deduction 
and total account balance after salary has been credited. */

/** @author KAILASH JOSHI*/

public class Employee { // base class
	String empName = "Kailash Joshi";
	float empSal;
	float effectiveSal;
	float totAccBalance = 0;

	public static void main(String[] args) {
		EmployeeInfo empinfo = new EmployeeInfo();
		empinfo.setSalary(25000);
		empinfo.deductTax();
		empinfo.addSalary();
		empinfo.dispTotAccBalance();
	}
}

class EmployeeInfo extends Employee implements Salary, Tax { // subclass
	public void deductTax() {
		effectiveSal = (float) (empSal - empSal * 0.25);
	}

	public void setSalary(float empSal) {
		this.empSal = empSal;
	}

	public void dispTotAccBalance() {
		System.out
				.println("Employee_name    Salary     Net_Salary   Total_Account_Balance");
		System.out
				.println("--------------------------------------------------------------");
		System.out.println(empName + "    " + empSal + "    " + effectiveSal
				+ "      " + totAccBalance);
	}

	public void addSalary() {
		totAccBalance = totAccBalance + effectiveSal;
	}
}

interface Salary { // salary interface

	void addSalary();
}

interface Tax { // tax interface

	void deductTax();
}
/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */

