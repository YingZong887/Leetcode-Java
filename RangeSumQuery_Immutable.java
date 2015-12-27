
public class RangeSumQuery_Immutable {
	int[] dp;
	public RangeSumQuery_Immutable(int[] nums) {
		dp = new int[nums.length];
		int sum = 0;
		for(int i = 0; i < nums.length; i++){
			sum += nums[i];
			dp[i] = sum;
		}
	}

	public int sumRange(int i, int j) {
		return (i == 0? dp[j] : dp[j] - dp[i - 1]);
	}
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);