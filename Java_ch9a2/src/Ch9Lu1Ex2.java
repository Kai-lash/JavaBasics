/*
Write a program that performs the following operations on string. You must use 
the StringBuffer class and methods.
1. Obtain the length of the string
2. Display the third character in the string
3. Append another string to the end of the existing string 
 */

/** @author KAILASH JOSHI*/

public class Ch9Lu1Ex2 {
	public static void main(String[] args) {

		int lengthOfString = 0;
		String string = " to Java";
		StringBuffer strBuffer = new StringBuffer("Welcome");
		lengthOfString = strBuffer.length();

		System.out.println("The length of the String is : " + lengthOfString); // length of the string

		System.out.println("The third character in the string is : "         // third character
				+ strBuffer.charAt(2));
		strBuffer.append(string);

		System.out.println("The modified string is \"" + strBuffer + "\"");   // appended string

	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */