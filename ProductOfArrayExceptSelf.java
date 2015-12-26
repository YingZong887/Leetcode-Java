
public class ProductOfArrayExceptSelf {
	public int[] productExceptSelf(int[] nums) {
		int len = nums.length;
		int[] result = new int[len];
		result[0] = 1;
		
		for(int i = 1; i < len; i++) {
			result[i] = result[i-1] * nums[i-1]; 
		}
		
		int coe = 1;
		for(int j = len-1; j >=0; j--) {
			result[j] = result[j] * coe;
			coe = coe * nums[j];
		}

		return result;

	}
}
