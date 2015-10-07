/* 
 * Observe the code that is provided below. The code compiles correctly. However, when you try
 * to run this code, an exception is raised and the program terminates.
 * Introduce exception handling in the following code so that the program does not terminate
 * due to an error and the errors are caught and handled gracefully.
 */
/** @author KAILASH JOSHI*/
class CustomerCareExecutive {
	String executiveName;
	int rating;

	public void dusplayDetails() {
		System.out.println(executiveName);
		System.out.println(rating);
	}
}

public class Ch11Ex1 {
	CustomerCareExecutive exObj[];

	public Ch11Ex1() {
		try {

			for (int ctr = 0; ctr != 3; ctr++) {
				exObj[ctr] = new CustomerCareExecutive();
			}
			exObj[0].executiveName = "Robert";
			exObj[0].rating = Integer.parseInt("30+40");
			exObj[1].executiveName = "Gaurav";
			exObj[1].rating = Integer.parseInt("85");
			exObj[2].executiveName = "Jeetendra";
			exObj[2].rating = Integer.parseInt("60");
		} catch (Exception e) {
			System.out.println("Exception caught in Ch11Ex1()");
		}

	}

	public void displayCollection() {
		try {
			for (int ctr = 0; ctr != 3; ctr++) {
				exObj[ctr].dusplayDetails();
			}
		} catch (Exception e) {
			System.out.println("Exception caught in displayCollection()");
		}
	}

	public static void main(String args[]) {
		Ch11Ex1 collectionObj;
		collectionObj = new Ch11Ex1();
		collectionObj.displayCollection();
		System.out.println("All Records displayed");
	}
}
