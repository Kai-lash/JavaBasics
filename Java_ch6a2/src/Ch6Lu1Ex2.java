/*Store the years 2012,2013,2014,2015 in a array and check which are leap
 years and which are not. */
/** @author KAILASH JOSHI*/
public class Ch6Lu1Ex2 {
	public static void main(String[] args) {

		int year_array[] = { 2012, 2013, 2014, 2015 };

		for (int i = 0; i < year_array.length; i++) {

			if (year_array[i] % 4 == 0) {
				System.out.println("Year " + year_array[i] + " is a leap year");
			} else
				System.out.println("Year " + year_array[i]
						+ " is not a leap year");
		}
	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */