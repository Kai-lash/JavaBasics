/* Define a class. Declare a global static integer variable and a member variable for the class. Both variables should be initialized using two different values. Access these two variables using an instance of this class and print their values on the console.*/

/** @author KAILASH JOSHI*/

public class Ch3Ex4
{
	public static void main (String[] args)
	 { 
		Test test = new Test();	
		
		int int_var1=test.getVar1();
		int int_var2=test.getVar2();
		
		System.out.println("The value of the static integer variable is : "+int_var1);
		System.out.println("The value of the member variable is : "+int_var2);
	 } 
}

class Test {
	public static int int_var1= 100;
	public int int_var2= 5;
	
	public int getVar1(){
		return int_var1;
	}
	
	public int getVar2(){
		return int_var2;
	}
	
}
/*After completing the exercise, you can submit it using the button provided 
on the application. You should find a button near the bottom 
right corner of your screen.*/ 