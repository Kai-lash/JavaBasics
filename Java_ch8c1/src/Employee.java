/* Create a class called Employee. Implement two methods in this class for calculating 
the remaining years of service. Both methods should have an identical name, the name
 must be the same. The parameter list for one should take a parameter for an year 
and the other one should have no parameters. In the method with no parameters, 
the years of service from the current year should be calculated and returned. In 
the method that takes an year as a parameter, the retirement year should be calculated 
from the passed in value. Also provide a method for setting the employees current age. 
The remaining years of service should be calculated using the retirement age, current 
age and the specified year to calculate from.

Instantiate this class and demonstrate the usage of both these methods. Display the returned
value from both methods.*/

/** @author KAILASH JOSHI*/

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Employee {
	int retireAge = 58;
	int currAge;
	int remYear;

	void setCurrentAge(int currAge) {
		this.currAge = currAge;
	}

	void calcRemYear() {
		remYear = retireAge - currAge;
	}

	void calcRemYear(int year) {
		Calendar calendar = new GregorianCalendar();
		retireAge = currAge + year - calendar.get(Calendar.YEAR);
		remYear = retireAge - currAge;
	}

	void dispRemYearOfService() {
		System.out
				.println("The remaining year of service of the employee is : "
						+ remYear);
	}

	public static void main(String[] args) {
		Employee employee = new Employee();

		employee.setCurrentAge(23);
		employee.calcRemYear(); // if the employee retires at the standard age
								// of 58.
		employee.dispRemYearOfService();

		employee.setCurrentAge(23);
		employee.calcRemYear(2020); // if an employee retires in 2020
		employee.dispRemYearOfService();
	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */
