/*Create an interface called IAllowance that has a method for computing the salary 
of a person. It should expect parameters for base salary, medical allowance 
and HRA. Now, create a class that implements this interface.*/

/** @author KAILASH JOSHI*/

public class Salary implements IAllowance {
	static float salary = 0;

	public void computeSalary(float baseSalary, float medAllowance, float hra) {
		salary = baseSalary + medAllowance + hra;

	}

	public static void main(String[] args) {
		Salary sal = new Salary();
		IAllowance allowance;
		allowance = sal;
		allowance.computeSalary(20000, 3000, 2000);
		System.out.println("The Total salary of the employee is : " + salary);
	}
}

interface IAllowance { // Interface
	float baseSalary = 0;
	float medAllowance = 0;
	float hra = 0;

	void computeSalary(float baseSalary, float medAllowance, float hra);
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */