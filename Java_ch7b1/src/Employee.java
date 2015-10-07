/*Write a java program using a constructor to calculate the number of years of 
service of an employee in a company. Use two variables namely age and retirement.*/

/** @author KAILASH JOSHI*/

public class Employee {
	int empAgeAtJoining;
	int empAgeAtRetrmt;
	int totNoYears;

	public Employee(int empAgeAtJoining, int empAgeAtRetrmt) {
		this.empAgeAtJoining = empAgeAtJoining;
		this.empAgeAtRetrmt = empAgeAtRetrmt;
		totNoYears = empAgeAtRetrmt - empAgeAtJoining;
	}

	void dispTotNoYears() {
		System.out.println("The total no of service of the Employee is "
				+ totNoYears + " years.");
	}

	public static void main(String[] args) {
		Employee employee = new Employee(23, 58);
		employee.dispTotNoYears();
	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */

