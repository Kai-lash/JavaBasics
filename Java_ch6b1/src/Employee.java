/*Create a class called Employee. It should have a member variable each 
for employee Id and employee name. Now, create an array of three Employee 
objects. Display the id and name of each employee contained in the array.*/

/** @author KAILASH JOSHI*/

public class Employee {
	String empName = "";
	String empID = "";

	void setEmpName(String empName) {
		this.empName = empName;
	}

	void setEmpID(String empID) {
		this.empID = empID;
	}

	void dispEmpName() {
		System.out.println("Employee Name : " + empName);
	}

	void dispEmpID() {
		System.out.println("Employee ID : " + empID);
	}

	public static void main(String[] args) {
		Employee employee[] = new Employee[3];
		for (int i = 0; i < employee.length; i++) {
			employee[i] = new Employee();
		}
		employee[0].setEmpName("Rahul");
		employee[0].setEmpID("101");
		employee[1].setEmpName("Sachin");
		employee[1].setEmpID("102");
		employee[2].setEmpName("Dhoni");
		employee[2].setEmpID("103");

		for (int i = 0; i < employee.length; i++) {

			employee[i].dispEmpID();
			employee[i].dispEmpName();
		}
	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */