/* Create a base class called Employee. It should have variables for representing 
details such as name, department and salary.Create another class called Manager. 
It should derive from the Employee class. This class should have a member variable 
for representing the total size of the team that this person manages.Instantiate 
the Manager class and display the manager's name, department, salary and the number 
of people that he manages on the console.*/

/** @author KAILASH JOSHI*/

public class Employee {
	String empName = "";
	String empDept = "";
	int empSal;

	void setEmpName(String empName) {
		this.empName = empName;
	}

	void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.setEmpDept("IT");
		manager.setEmpName("Kailash Joshi");
		manager.setEmpSal(25000);
		manager.setTotalTeamSize(40);
		manager.dispEmpDetail();

	}
}

class Manager extends Employee {
	int totalTeamSize;

	void setTotalTeamSize(int totalTeamSize) {
		this.totalTeamSize = totalTeamSize;
	}

	void dispEmpDetail() {
		System.out
				.println("Manager's Name       Dept     Salary     Team Size");
		System.out
				.println("--------------------------------------------------");
		System.out.println(empName + "        " + empDept + "       " + empSal
				+ "      " + totalTeamSize);
	}
}
/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */

