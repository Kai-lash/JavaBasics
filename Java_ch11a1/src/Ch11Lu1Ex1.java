/* The following code has some errors in it. Review this code and recitify
 * any errors that you might discover in it.
 */

/** @author KAILASH JOSHI*/

public class Ch11Lu1Ex1 
{
	public static void main(String [] args) 
	{
		String s = "42";
		try 
		{
			s = s.concat(".5");
			double d = Double.parseDouble(s);
			System.out.println("d  "+d);
			s = Double.toString(d);
			int z=(int)d;
			System.out.println(z);
			int y=0;
			y=Integer.valueOf(s);
			System.out.println(y);
			int x = (int) Math.ceil(Double.valueOf(s).doubleValue());
			System.out.println(x);
		}
		catch (NumberFormatException e) 
		{
			System.out.println("bad number");
		}
	}
}



