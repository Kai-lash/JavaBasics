/*
 Write a program to find the decimal value of the following binary numbers 
using valueOf () method:
1. 10100
2. 10111  
*/

/** @author KAILASH JOSHI*/

public class Ch9Lu2Ex2 
{
     public static void main (String[] args) 
     {
    	 int decimalVal=Integer.valueOf("10100",2);   
    	 System.out.println("The decimal value of 10100 is : "+decimalVal);
    	 
    	 decimalVal=Integer.valueOf("10111",2);   
    	 System.out.println("The decimal value of 10111 is : "+decimalVal);
     }                                    
}
                                    
/*After completing the exercise, you can submit it using the button provided 
on the application. You should find a button near the bottom 
right corner of your screen.*/ 
