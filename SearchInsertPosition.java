
public class SearchInsertPosition {
	/**
	 * find the first position >= target
	 * @param nums
	 * @param target
	 * @return
	 */
	public int searchInsert(int[] nums, int target) {
		int start = 0;
		int end = nums.length-1;
		
		while(start+1 < end) {
			int mid = (start + end) / 2;
			if(nums[mid] == target) {
				return mid;
			} else if(nums[mid] < target) {
				start = mid;
			} else {
				end = mid;
			}
		}
		if(nums[start] >= target) {
			return start;
		} else if(nums[end] >= target) {
			return end;
		} else {
		    return end + 1;
		}
		
	}

}
