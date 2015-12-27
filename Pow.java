
public class Pow {
	public double myPow(double x, int n) {
		if(n == 0) {
			return 1.0;
		}
		boolean isNagetive = false;
		if(n < 0) {
			isNagetive = true;
			n = -n;
		}
		double result;
		if(n % 2 == 0) {
			result = myPow(x*x, n>>1);
		} else {
			result = myPow(x*x, n>>1) * x;
		}

		return (isNagetive? 1/result : result);

	}
}
