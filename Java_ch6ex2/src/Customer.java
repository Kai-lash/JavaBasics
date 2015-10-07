/*Create a class called Customer. It should have data members for customer 
name, mobile number and total sale value. Create five Customer objects. 
Print the details of 5 customers in the given tabular format:
   Customer Name     Mobile           Total Sales 
  ------------------------------------------------
   Rajeev          9999888230          50000
   Sanjeev         8888887555          40000 */


/** @author KAILASH JOSHI*/

public class Customer {
	String custName = "";
	String custMobNo = "";
	float totSales;

	void setCustName(String custName) {
		this.custName = custName;
	}

	void setCustMobNo(String custMobNo) {
		this.custMobNo = custMobNo;
	}

	void setTotSales(float totSales) {
		this.totSales = totSales;
	}

	void dispCustDetail() {
		System.out.println(custName + "           " + custMobNo + "       "
				+ totSales);
	}

	public static void main(String[] args) {
		Customer customer[] = new Customer[5];
		for (int i = 0; i < customer.length; i++) {
			customer[i] = new Customer();
		}
		customer[0].setCustName("Rahul");
		customer[0].setCustMobNo("9823145326");
		customer[0].setTotSales(20000);
		customer[1].setCustName("Raina");
		customer[1].setCustMobNo("9823145387");
		customer[1].setTotSales(25000);
		customer[2].setCustName("Dhoni");
		customer[2].setCustMobNo("9823145334");
		customer[2].setTotSales(35000);
		customer[3].setCustName("David");
		customer[3].setCustMobNo("9823145389");
		customer[3].setTotSales(24000);
		customer[4].setCustName("Ricky");
		customer[4].setCustMobNo("9823145308");
		customer[4].setTotSales(34000);
		System.out.println("Customer Name     Mobile         Total Sales ");
		System.out.println("--------------------------------------------");
		for (int i = 0; i < customer.length; i++) {

			customer[i].dispCustDetail();

		}
	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */