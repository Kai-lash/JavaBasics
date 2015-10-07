/*Create a class called Employee. It should have a member variable for 
employee Id, employee name and employee salary. Now, create an array of 
three Employee objects. Display the contents of the array in the following format:
	Id        Name        Salary
	1         Joe         15000
	2         Sanjay      20000
 */

/** @author KAILASH JOSHI*/

public class Employee {
	String empName = "";
	String empID = "";
	String empSal = "";

	void setEmpName(String empName) {
		this.empName = empName;
	}

	void setEmpID(String empID) {
		this.empID = empID;
	}

	void setEmpSal(String empSal) {
		this.empSal = empSal;
	}

	void dispEmpDetail() {
		System.out.println(empID + "       " + empName + "       " + empSal);
	}

	public static void main(String[] args) {
		Employee employee[] = new Employee[3];
		for (int i = 0; i < employee.length; i++) {
			employee[i] = new Employee();
		}
		employee[0].setEmpName("Rahul");
		employee[0].setEmpID("101");
		employee[0].setEmpSal("20000");
		employee[1].setEmpName("Raina");
		employee[1].setEmpID("102");
		employee[1].setEmpSal("25000");
		employee[2].setEmpName("Dhoni");
		employee[2].setEmpID("103");
		employee[2].setEmpSal("30000");
		System.out.println("Id        Name        Salary");
		for (int i = 0; i < employee.length; i++) {

			employee[i].dispEmpDetail();

		}
	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */