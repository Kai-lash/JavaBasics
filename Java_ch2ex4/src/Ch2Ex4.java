/* Create a class and within main() method,write a program to print 
a welcome message on screen. */

/** @author KAILASH JOSHI*/

public class Ch2Ex4 
{
  public static void main (String[] args) 
	{
	    Print print = new Print();
		String msg="Welcome to Java";
		print.printMsg(msg);
	} 
}

class Print {
	
	public void printMsg(String string) {
		System.out.println(string);
	}
}

/*After completing the exercise, you can submit it using the button provided 
on the application. You should find a button near the bottom 
right corner of your screen.*/ 