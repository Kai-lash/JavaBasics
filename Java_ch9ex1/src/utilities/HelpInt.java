package utilities;

public class HelpInt {

	double sqrt = 0, sqr = 0;

	public double calcSqrt(double number) {
		sqrt = Math.sqrt(number);
		return sqrt;
	}

	public double calcSqr(double number) {
		sqr = number * number;
		return sqr;
	}
}
