
public class MinimumSizeSubarraySum {
	public int minSubArrayLen(int s, int[] nums) {
		if(nums == null) {
			return 0;
		}

		int i = 0, j = 0;
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for(i = 0; i < nums.length; i++) {
			while(j < nums.length && sum < s) {
				sum += nums[j];
				j++;
			}
			if(sum >= s && j - i < min) {
				min = j - i;
			}
			sum -= nums[i];
		}
		if(min == Integer.MAX_VALUE) {
			return 0;
		}
		return min;  
	}
}
