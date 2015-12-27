
public class RemoveDuplicatesFromSortedArrayII {
	public int removeDuplicates(int[] nums) {
		if(nums == null || nums.length == 0) {
			return 0;
		}
		int end = 0;
		int copy = nums[0];
		int count = 0;
		for (int i = 1; i < nums.length; i++) {
			if(nums[i] == nums[i - 1]) {
				count++;
			} else {
				count = 0;
			}
			if(!(nums[i] == copy && count > 1)) {
				nums[++end] = nums[i];
				copy = nums[i];
			}
		}
		return end + 1;
	}
}
