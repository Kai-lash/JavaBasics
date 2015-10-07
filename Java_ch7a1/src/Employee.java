/*
Create a class called Employee. It should have two member variables for employee 
Id and the department to which the employee might belong. An employee can belong 
to either of the following two departments: DepA or DepB. Set the details for two
 employee objects. Depending on whether an employee belongs to DepA, print 
"Senior level" in addition to the Employee Id. Otherwise, print "Junior level" in 
addition to the Employee Id.

Document your code and follow naming conventions.*/
/** @author KAILASH JOSHI*/

public class Employee {
	String empID = "";
	String empDept = "";
	String empDesigntn = "";

	void setEmpID(String empID) {
		this.empID = empID;
	}

	void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	void setDispEmpInfo() {
		if (empDept.equals("DepA")) {
			empDesigntn = "Senior level";
		} else if (empDept.equals("DepB")) {
			empDesigntn = "Junior level";
		} else {
			empDesigntn = "";
		}
		System.out.println(empID + "   " + empDesigntn + "    " + empDept);
	}

	public static void main(String[] args) {
		Employee[] employee = new Employee[2];
		for (int i = 0; i < employee.length; i++) {
			employee[i] = new Employee();
		}
		employee[0].setEmpID("101");
		employee[0].setEmpDept("DepA");

		employee[1].setEmpID("102");
		employee[1].setEmpDept("DepB");

		System.out.println("ID    Level           Department");
		System.out.println("--------------------------------");
		for (int i = 0; i < employee.length; i++) {
			employee[i].setDispEmpInfo();
		}
	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */

