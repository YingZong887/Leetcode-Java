public class SearchInRotatedSortedArray {
	/**
	 * left and right, draw a picture
	 * @param nums
	 * @param target
	 * @return
	 */
	public int search(int[] nums, int target) {
		int start = 0;
		int end = nums.length-1;
		while(start + 1 < end) {
			int mid = start + (end - start)/2;
			if(nums[mid] == target) {
				return mid;
			}
			if(nums[mid] > nums[start]) {
				if(nums[mid] >= target && target >= nums[start]) {
					end = mid;
				} else {
					start = mid;
				}
			} else {
				if(nums[mid] <= target && target <= nums[end]) {
					start = mid;
				} else {
					end = mid;
				}
			}
		}
		if(nums[start] == target) {
			return start;
		} else if(nums[end] == target) {
			return end;
		} else {
			return -1;
		}
	}
}
