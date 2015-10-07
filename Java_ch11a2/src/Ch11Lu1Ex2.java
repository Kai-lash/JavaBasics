/* 
 * The following code was written for a toy company. It accepts customer details and displays 
 * them on the console. This code has some errors. You need to find them and fix them such
 * the code executes correctly.
 */
/** @author KAILASH JOSHI*/
class Toy
{
     int toyId; 
	 String toyName;
	 float toyPrice;
	 public Toy(int id,String name, float price)
	{
		toyId=id;
		toyName=name;
		toyPrice=price;
	}
	public void displayDetails()
	{
		System.out.println("Toy Id is:"+toyId);
		System.out.println("Toy Name is:"+toyName);
		System.out.println("Toy Price is:"+toyPrice);
	}
}

class Customer
{
	int custId;
	String custName;
	String custAddress;
	public Customer(int id,String name,String address)
	{
		custId=id;
		custName=name;
		custAddress=address;
	}
	public void displayDetails()
	{
		System.out.println("Customer Id is:"+custId);
		System.out.println("Customer Name is:"+custName);
		System.out.println("Customer Address is:"+custAddress);
	}
}
class OnlineCustomer extends Customer
{
	String loginId;
	String masterCardNo;
public OnlineCustomer(int cId, String name, String address, String id, String cardno)
	{
		super(cId,name,address);
		loginId=id;
		masterCardNo=cardno;
	}
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Customer login id is:"+loginId);
		System.out.println("Master Card No is:"+masterCardNo);
	}
}
public class Ch11Lu1Ex2
{
		public static void main(String args[])
			{
OnlineCustomer cObj=new OnlineCustomer(1001,"Carol","164, Redmond Way,Ohio","carol@usa.net","9473884833");
			Toy tObj=new Toy(1001,"Barbie Doll",40);
			cObj.displayDetails();
			tObj.displayDetails();
			}
}	


