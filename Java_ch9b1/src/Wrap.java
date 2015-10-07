/* Write a Java class that stores an integer item id, a string item name and a 
float price. Store all these in a String member Variable, separated by a space 
delimiter. Use an overloaded method to add these different types to the String member.
Provide a get method to retrieve the formatted string member and display it on the console.
In addition, as a second part of this exercise, initialize a couple of String 
objects that contain an integer and float number respectively. Determine the 
numeric values of these two Strings and calculate the average of the two.*/

/** @author KAILASH JOSHI */

public class Wrap {
	int itemId = 101;
	String itemName = "Mouse";
	float itemPrice = 250;
	String var1 = "50";
	String var2 = "25.5";
	String string = "";

	public static void main(String[] args) {

		Wrap wrap = new Wrap();
		wrap.add(wrap.itemId);
		wrap.add(wrap.itemName);
		wrap.add(wrap.itemPrice);

		System.out.println("The formatted string is : \"" + wrap.getString()
				+ "\"");
		wrap.showNumericString();

	}

	void showNumericString() {
		int intvar = Integer.parseInt(var1);
		float floatvar = Float.parseFloat(var2);
		float avg = (float) ((intvar + floatvar) * 0.5);

		System.out.println("The numeric value of integer variable is : "
				+ intvar);
		System.out.println("The numeric value of float variable is : "
				+ floatvar);
		System.out.println("And the average of the two variable is : " + avg);
	}

	void add(int itemId) {
		string += Integer.toString(itemId) + " ";
	}

	void add(String itemName) {
		string += itemName + " ";
	}

	void add(float itemPrice) {
		string += Float.toString(itemPrice);
	}

	String getString() {
		return string;
	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */
