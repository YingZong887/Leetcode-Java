
public class RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] nums) {
		if(nums == null || nums.length == 0) {
			return 0;
		}
		int end = 0;
		int copy = nums[0];
		for(int i = 1; i < nums.length; i++) {
			if(nums[i] != copy) {
				nums[++end] = nums[i];
				copy = nums[i];
			}
		}
		return end + 1;
	}
}
