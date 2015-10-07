/* Write a program with a class Student. This class should have an integer 
 variable to represent the roll number and a string variable for representing the 
 student's name. This should be declared using naming conventions. 

 Instantiate this class and initialize the member variables with sample values. 
 Display the value of each variable on the screen with appropriate messages.*/

/** @author KAILASH JOSHI*/

public class Ch4Ex1 {
	public static void main(String[] args) {
		Student student = new Student(41, "Kailash Joshi");
	}
}

class Student {

	Student(int studRollNo, String studName) {

		System.out.println("Student roll no is : " + studRollNo);
		System.out.println("Student name is : " + studName);
	}

}
/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */