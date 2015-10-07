import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
 Write a program that reads input from the console in the form of a string. When 
 the user enters a word called end, the program should stop reading from the console 
 and print out the values that have been entered so far.*/
/** @author KAILASH JOSHI*/
public class Ch10Lu1Ex1 {
	public static void main(String[] args) throws IOException {
		String str = "";
		String strTemp = "";
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			str = bf.readLine();
			if (strTemp.equalsIgnoreCase("")) {
				strTemp = str;
			} else {
				strTemp = strTemp + " " + str;
			}
			if (str.equalsIgnoreCase("end") && !strTemp.equals("end")) {
				System.out.println(strTemp.substring(0,
						strTemp.lastIndexOf(' ')));
				System.exit(0);
			} else if (str.equalsIgnoreCase("end") && strTemp.equals("end")) {

				System.exit(0);
			}
		}
	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */
