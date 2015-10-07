/*
Create an abstract base class called Details. It should have an abstract method 
to get the employee name. Derive a sub class from this abstract class and instantiate 
it. Display the details.*/

/** @author KAILASH JOSHI*/

abstract class Details {

	String empName = "Kailash joshi";

	abstract String getEmpName(); // abstract method
}

class DerivedDetails extends Details {

	public String getEmpName() { // implementation of the abstract method
		return empName;
	}

	public static void main(String[] args) {
		DerivedDetails dtl = new DerivedDetails();
		System.out.println("The name of the Employee is : " + dtl.getEmpName());
	}
}
/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */