
public class RotateArray {
	/**
	 * 
	 * @param nums
	 * @param k
	 */
	public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k%len;
		reverse(nums, 0, len - k - 1);
		reverse(nums, len - k, nums.length-1);
		reverse(nums, 0, nums.length-1);
	}
	
	private void reverse(int[] nums, int start, int end) {
		for(int i = start, j = end; i < j; i++, j--) {
			int temp = nums[j];
			nums[j] = nums[i];
			nums[i] = temp;	
		}
	}
}
