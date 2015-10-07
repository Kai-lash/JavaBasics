/* Create a class called Student with data members for name and address. Also supply two 
methods to accept data and display data. Create a nested class called Marks inside the
Student class. This class will contain marks for five subjects and two methods for 
accepting and displaying data. From the main method, create an object of type Student 
and display that student's name, address and marks. */

/** @author KAILASH JOSHI*/

public class Student
{
	String studName = "";
	String studAddr = "";
	Marks marks = new Marks();

	void setStudDetail(String studName, String studAddr, int sub1Marks,
			int sub2Marks, int sub3Marks, int sub4Marks, int sub5Marks) 
	{
		this.studAddr = studAddr;
		this.studName = studName;

		marks.setStudMarks(sub1Marks, sub2Marks, sub3Marks, sub4Marks,
				sub5Marks);
	}

	void dispStudDetail()
	{
		System.out.println("The name of the student is " + studName
				+ " and address is " + studAddr);

		marks.dispStudMarks();
	}

	class Marks 
	{
		int sub1Marks;
		int sub2Marks;
		int sub3Marks;
		int sub4Marks;
		int sub5Marks;

		void setStudMarks(int sub1Marks, int sub2Marks, int sub3Marks,
				int sub4Marks, int sub5Marks) 
		{

			this.sub1Marks = sub1Marks;
			this.sub2Marks = sub2Marks;
			this.sub3Marks = sub3Marks;
			this.sub4Marks = sub4Marks;
			this.sub5Marks = sub5Marks;

		}

		void dispStudMarks() 
		{
			System.out.println("The marks of students are as follows:");
			System.out.println("sub1Marks : " + sub1Marks);
			System.out.println("sub2Marks : " + sub2Marks);
			System.out.println("sub3Marks : " + sub3Marks);
			System.out.println("sub4Marks : " + sub4Marks);
			System.out.println("sub5Marks : " + sub5Marks);
		}
	}

	public static void main(String[] args) 
	{
		Student student = new Student();
		student.setStudDetail("Kailash", "Vadodara", 45, 56, 67, 78, 65);
		student.dispStudDetail();
	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */

