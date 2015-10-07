/* Create a class called Student. It should have data members for student 
name and percentage marks. Create an array of four Student objects. Display 
the name and percentages of each object in this array.*/

/** @author KAILASH JOSHI*/

public class Student {
	String studName = "";
	float studPercent;

	void setStudName(String studName) {
		this.studName = studName;
	}

	void setStudPercent(float studPercent) {
		this.studPercent = studPercent;
	}

	void dispStudDetail() {
		System.out.println(studName + "       " + studPercent);
	}

	public static void main(String[] args) {
		Student[] student = new Student[4];

		for (int i = 0; i < student.length; i++) {
			student[i] = new Student();
		}

		student[0].setStudName("Rahul");
		student[0].setStudPercent(85);
		student[1].setStudName("Mohan");
		student[1].setStudPercent(75);
		student[2].setStudName("Huges");
		student[2].setStudPercent(65);
		student[3].setStudName("Kiran");
		student[3].setStudPercent(78);
		System.out.println("Name        Percentage(%)");
		for (int i = 0; i < student.length; i++) {

			student[i].dispStudDetail();

		}
	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */