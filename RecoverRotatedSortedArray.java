
public class RecoverRotatedSortedArray {
	/**
	 * recover rotated sorted array.
	 * eg:[5,6,1,2,3] --> [1,2,3,5,6]
	 * space: O(1), time: O(n)
	 * @param nums
	 * @return
	 */
	public void recover(int[] nums) {
		for(int i = 0; i < nums.length-1; i++) {
			if(nums[i] < nums[i+1]) {
				reverse(nums, 0, i);
				reverse(nums, i+1,nums.length-1);
				reverse(nums, 0, nums.length-1);
				return;
			}
		}
	}
	
	private void reverse(int[] nums, int start, int end) {
		for(int i = start, j = end; i < j ; i++, j--){
			int temp = nums[j];
			nums[j] = nums[i];
			nums[i] = temp;			
		}
	}
}
