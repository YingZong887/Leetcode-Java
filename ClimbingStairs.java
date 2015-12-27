
public class ClimbingStairs {
	public int climbStairs(int n) {
		int[] scheme = new int[n + 1];
		if(n < 1){
			return 0;
		}
		//initialize
		scheme[0] = 1;
		scheme[1] = 2;

		//function
		for(int i = 2; i < n; i++){
			scheme[i] = scheme[i - 1] + scheme[i - 2];
		}

		return scheme[n - 1];
	}
}
