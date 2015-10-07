/*
Create a package called utilities. Create a class called SalaryCalculator in this package. 
Provide a method for incrementing the salary of an employee based on the passed salary.

The salary should be incremented as follows.
If the salary of the employee is greater than 10000, the salary should be incremented by 5000.

If the salary is less than 10000, there should be no increment in the salary.

Invoke this method for salaries of 15000 and 9000. Print the values returned by your 
function for each of these passed salaries.
 */

/** @author KAILASH JOSHI*/

package utilities;

public class SalaryCalculator {
	float incrEmpSalary = 0;

	void incrSalary(float empSalary) {
		if (empSalary > 10000) {
			incrEmpSalary = empSalary + 5000;
			System.out.println("Congratulations ! Salary incremented to " + incrEmpSalary);

		} else {
			System.out
					.println("Sorry ! There is no increment for the salary less than 10000");
		}
	}

	public static void main(String[] args) {
		SalaryCalculator sal = new SalaryCalculator();
		sal.incrSalary(15000);
		sal.incrSalary(9000);
	}

}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */
