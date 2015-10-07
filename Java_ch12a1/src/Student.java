/*Write a program to get the marks of a student for five subjects. Calculate the average score for these five subjects. If the average is less than 50, throw an exception. Print a message when this exception is caught.*/
/**@author KAILASH  */
class MyException extends Exception {
	MyException(String message) {
		super(message);
	}
}

public class Student {
	float sub1, sub2, sub3, sub4, sub5, avg;

	void setSubMarks(float sub1, float sub2, float sub3, float sub4, float sub5) {
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
		this.sub5 = sub5;
	}

	void calcAverage() {
		avg = (sub1 + sub2 + sub3 + sub4 + sub5) / 5;
	}

	public static void main(String[] args) throws MyException {
		Student student = new Student();
		student.setSubMarks(48, 52, 49, 51, 47);
		student.calcAverage();
		try {
			if (student.avg < 50) {
				throw new MyException(
						"Average of the 5 subjects is less than 50 !");
			} else {
				System.out.println("Average of the 5 subjects is : "
						+ student.avg);
			}
		} catch (MyException e) {
			System.out.println("User defined Exception caught !");
			System.out.println(e.getMessage());
		}

	}

}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */
