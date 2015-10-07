/*Write a program to create a list and add 5 elements to it. Then use the iterator
 method and remove the second element in the list. Also print the modified list.*/

/** @author KAILASH JOSHI*/
import java.util.*;

public class Ch13Ex1 {
	public static void main(String[] args) {
		List arraylst = new ArrayList();
		for (int i = 5; i <= 10; i++) {
			arraylst.add(i);
		}
		int[] lst = new int[6];
		Iterator iter = arraylst.iterator();
		System.out.println("Created list :");
		while (iter.hasNext()) {
			int int_var = (Integer) iter.next();

			System.out.print(int_var + " ");
		}
		Iterator iter2 = arraylst.iterator();
		for (int i = 0; i <= 5; i++) {
			iter2.next();
			if (i == 1) {
				iter2.remove();
			}
		}
		System.out.println();

		Iterator iter1 = arraylst.iterator();
		System.out.println("Modified list :");

		while (iter1.hasNext()) {
			int int_var = (Integer) iter1.next();
			System.out.print(int_var + " ");

		}
	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */
