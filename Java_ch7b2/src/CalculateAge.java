/* Write a java program with a class CalculateAge which defines and uses a static 
method to calculate the age of a given person, given the year of that person's birth.*/

/** @author KAILASH JOSHI*/

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalculateAge {
	static int yearOfBirth = 1989;
	static int age;

	static int age() {

		Calendar calendar = new GregorianCalendar();
		age = calendar.get(Calendar.YEAR) - yearOfBirth;
		return age;
	}

	public static void main(String[] args) {
		int age = CalculateAge.age();
		System.out.println("The age of the person is " + age);
		
	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */

