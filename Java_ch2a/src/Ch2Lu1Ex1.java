/** @author KAILASH JOSHI*/
/* Create a class 'Student' and provide a method to add marks for two subjects,
   for a student. Print the total in the console. */

public class Ch2Lu1Ex1
 {
  public static void main (String[] args)
 	{
	  	Student stud = new Student();
	     int sub1=75;
	     int sub2=85;
	     int total_marks;
	     total_marks= stud.addMarks(sub1,sub2);
	     System.out.println("The total marks of the two subjects are : "+total_marks);
	}
 }

class Student {
	public int addMarks(int sub1,int sub2){
		int total_marks= sub1+ sub2;
		return total_marks;
	}
}

/*After completing the exercise, you can submit it using the button provided 
on the application. You should find a button near the bottom 
right corner of your screen.*/ 