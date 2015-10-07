/*Create an ArrayList using a List variable.
 * Using a for loop, add the numbers 5 to 10 to this list.
 * Print the contents of the list after the numbers have been added.*/

/** @author KAILASH JOSHI*/
import java.util.*;

public class Ch13Lu2Ex1 {

	public static void main(String[] args) {
		List arraylst = new ArrayList();
		for (int i = 5; i <= 10; i++) {
			arraylst.add(i);
		}
		int[] lst = new int[6];
		for (int i = 0; i <= 5; i++) {
			lst[i] = (Integer) arraylst.get(i);
			System.out.println("Number at " + i + " position : " + lst[i]);
		}
	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */