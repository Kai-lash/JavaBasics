import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/** @author KAILASH JOSHI*/

/*
 * Write a program to create a Set variable to represent a Hashset.Add 5 long
 * integers to this set. Using the max and min methods of Collections class,
 * find the maximum and the minimum value in the set.
 */

public class Ch13Ex2 {
	public static void main(String[] args) {
		Set hash = new HashSet();
		hash.add(100l);
		hash.add(2000l);
		hash.add(30l);
		hash.add(400l);
		hash.add(6000l);
		long max = Collections.max(hash);
		long min = Collections.min(hash);

		System.out.println("The maximum value from the set is : " + max);
		System.out.println("The minimum value from the set is : " + min);
	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */
