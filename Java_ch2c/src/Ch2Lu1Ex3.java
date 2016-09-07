/** @author KAILASH JOSHI*/
/* Create a class called 'Company' and the class should have members to
   represent details such as Name, Address, Phone number. Instantiate this
   class for a company called Neo Tech and print its details on the console. */

public class Ch2Lu1Ex3
 {
  public static void main (String[] args)
	{
	    String comp_name="Neo Tech";
		String comp_addr="A-14, Hinjewadi, Pune";
		String comp_phNo="0221234444";
	  Company neo_tech = new Company(comp_name, comp_addr, comp_phNo);
	}
 }

class Company {
	String comp_name="";
	String comp_addr="";
	String comp_phNo="";
	
	 Company(String comp_name,String comp_addr,String comp_phNo){
		 
		 this.comp_name=comp_name;
		 this.comp_addr=comp_addr;
		 this.comp_phNo=comp_phNo;
		 
		 System.out.println("The name of the Company is : "+comp_name);
		 System.out.println("Address is : "+comp_addr);
		 System.out.println("Phone no. is : "+comp_phNo);
	 }
}
