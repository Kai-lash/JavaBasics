/*
In a package called utilities, create a StringHelper class. It should provide a method 
that returns the names of the passed employees after converting them to uppercase.

Instantiate this class and pass a value e.g. joe smith. Display the returned value 
in the console.*/

/** @author KAILASH JOSHI*/

import utilities.StringHelper;

/* Following is the StringHelper class defined in the utilities package.
 * 
   public class StringHelper {

	public String convertToUpper(String string) {
		return string.toUpperCase();
	}
}
  */
public class Ch9Ex2 
{
     public static void main (String[] args)
     {
           StringHelper help = new StringHelper();
           System.out.println("The upper case for \"joe smith\" is : \""+help.convertToUpper("joe smith")+"\"");
     }                                    
}
                                    
/*After completing the exercise, you can submit it using the button provided 
on the application. You should find a button near the bottom 
right corner of your screen.*/ 