/* In the following code snippet, a few statements are provided. Each statement 
is preceded by a comment with an instruction to modify the statement immediately 
after it. Modify the statements according to the specified condition*/

/** @author KAILASH JOSHI*/

public class Ch3Lu3Ex3
{
	public static void main(String args[])
	{
		int x,y,z,result=0;
		x=1;
		y=2;
		z=3;
		
		// using x, y and z, create an expression that evaluates the result to 7		// all three variables must be used in the expression.	// You can use operators such as +, -, *, / and paranthesis ()	// as an example -> result = x + y - 3 evaluates to 0

		result = (z * y) + x ;
		System.out.println("Result value : "+result);

		// using x, y and z, create an expression that evaluates the result to 9		// all three variables must be used in the expression.	// You can use operators such as +, -, *, / and paranthesis ()	// as an example -> result = x + y - 3 evaluates to 0

		result = (y * z) + (x + 2);
		System.out.println("Result value : "+result);
		
		// using y and z, create an expression that evaluates the result to 12		// Hint : You can use a shift operator		result = ;
		result = z << y;
		System.out.println("Result value : "+result);
		
	}
}


/*After completing the exercise, you can submit it using the button provided 
on the application. You should find a button near the bottom 
right corner of your screen.*/ 
