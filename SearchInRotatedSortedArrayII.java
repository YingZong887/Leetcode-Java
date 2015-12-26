
public class SearchInRotatedSortedArrayII {
	/**
	 * cannot use BS. only O(n)
	 * @param nums
	 * @param target
	 * @return
	 */
	public boolean search(int[] nums, int target) {
		for(int i = 0; i < nums.length; i++){
			if(nums[i] == target) {
				return true;
			}
		}
		return false;
	}
}
