/** @author KAILASH JOSHI*/
/* Harvard College has 2 types of students - Day Scholars and Boarders.
   Create a class that records student details and distinguishes between
   the different types of students. */

public class Ch2Ex1
{
  public static void main (String[] args)
	 {
	  	Student student = new Student();
	  	
	  	student.setStudentDetail("Sachin", "Day Scholars", "101");
	  	student.printStudentDetail();
	  	
	  	student.setStudentDetail("Rahul", "Boarders", "102");
	  	student.printStudentDetail();

	 }
}

class Student {
	
	String student_name="";
	String student_type="";
	String student_id="";
	
	public void setStudentDetail(String student_name,String student_type,String student_id){
		this.student_name=student_name;
		this.student_type=student_type;
		this.student_id=student_id;
	}
	public void printStudentDetail(){
		System.out.println("Student name is : "+student_name);
		System.out.println("Student type is : "+student_type);
		System.out.println("Student ID is : "+student_id);
		System.out.println();
	}
}

