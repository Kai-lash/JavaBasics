/*Write a program to accept the name and age of a Student. The age of the student 
 * should be between 25 to 35. For this comparison, use an assert statement.
 * If it is not in the valid range, print an error message. Otherwise, print the 
 * valid output.*/
/** @author KAILASH JOSHI*/
public class Student {
	String studName = "";
	int age = 0;

	void setStudInfo(String studName, int age) {
		assert (age >= 25 && age <= 35);
		this.studName = studName;
		this.age = age;
	}

	void dispInfo() {
		System.out.println("Name of the student is : " + studName
				+ " and age is : " + age);
	}

	public static void main(String[] args) {
		Student student = new Student();
		try {
			student.setStudInfo("Kailash", 23);
			student.dispInfo();
		} catch (AssertionError e) {
			System.out
					.println("The Student's age is not within the range of 25-35");
			e.printStackTrace();
		}
	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */
