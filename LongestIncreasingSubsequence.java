
public class LongestIncreasingSubsequence {
	public int lengthOfLIS(int[] nums) {
		if(nums.length == 0){
			return 0;
		}
		//state
		int[] length = new int[nums.length]; // the length of LIS ended with nums[i]
		int maxLength = 0;
		//initialize
		for(int i = 0; i < nums.length; i++){
			length[i] = 1;
			for(int j = 0; j < i; j++){
				if(nums[i] > nums[j]){
					length[i] = (length[i] < length[j] + 1? length[j] + 1 : length[i]);
				}
			}
			if(length[i] > maxLength){
				maxLength = length[i];
			}
		}
		return maxLength;

	}
}
