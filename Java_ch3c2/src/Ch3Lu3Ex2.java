/* In the following code snippet, a few statements are provided. Each statement 
is preceded by a comment with an instruction to modify the statement 
immediately after it. Modify the statements according to the specified condition.*/

/** @author KAILASH JOSHI*/

public class Ch3Lu3Ex2 
{
	public static void main(String args[])
	{
	  	int foo=10;
	  	int num=2;
	   	// change the following statement to use compound assignment, to get the same result. Hint: use += 
	  	foo += num;
	   	System.out.println("foo value : "+foo);
		// change the following statement to use compound assignment, to get the same result. Hint: use -=		
	   	foo -= num;
		System.out.println("foo value : "+foo);
		// change the following statement to use compound assignment, to get the same result. Hint: use /=		
		foo /= num;
		System.out.println("foo value : "+foo);
		// change the following statement to use compound assignment, to get the same result. Hint: use %=	
		foo %= num;
		System.out.println("foo value : "+foo);
	}
}
