/*Write a program that creats a Hashset.
 * In it add 3 integer values 1,2 and 3.
 * Then check whether the number 3 exists in the set or not using the contains method.*/

/** @author KAILASH JOSHI*/
import java.util.*;

public class Ch13Lu2Ex2 {

	public static void main(String[] args) {
		Set hash = new HashSet();
		hash.add(1);
		hash.add(2);
		hash.add(3);

		Iterator iter = hash.iterator();
		if (hash.contains(3)) {
			System.out.println("Number 3 is present");
		}
		System.out.println("All the numbers present in the hashset are : ");
		while (iter.hasNext()) {
			int int_var = (Integer) iter.next();
			System.out.println(int_var);
		}

	}

}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */