/** @author KAILASH JOSHI*/
/* Create a class 'Employee' and provide a method to calculate the employees
   gross salary by calculating HRA as 30% and DA as 20% of basic salary.
   Assume that the basic salary of the employee is Rs.12,000/- */

 public class Ch2Lu1Ex2

 {

  public static void main (String[] args)
	{
	  Employee emp= new Employee();
	  double hra_rate=0.3;
	  double da_rate=0.2;
	  int basic_salary=12000;
	  double gross_salary=emp.calc_GrossSalary(hra_rate,da_rate,basic_salary);
	  
	  System.out.println("The gross salary for the employee is : "+gross_salary);
	  
	}
 }
 
 class Employee {
	 public double calc_GrossSalary(double hra_rate, double da_rate, int basic_salary){
		 double gross_salary;
		 double hra=hra_rate*basic_salary;
		 double da=da_rate*basic_salary;
		 gross_salary= hra + da + basic_salary;
		 return gross_salary;
	 }
 }

