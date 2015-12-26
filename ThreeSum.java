import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(nums == null || nums.length < 3) {
			return result;
		}
		Arrays.sort(nums);
		for(int i = 0; i < nums.length - 2; i++) {
			if(i != 0 && nums[i] == nums[i-1]) {
				continue; // skip duplicates
			}
			int left = i + 1;
			int right = nums.length - 1;
			while(left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				if(sum == 0) {
					List<Integer> sum0 = new ArrayList<Integer>();
					sum0.add(nums[i]);
					sum0.add(nums[left]);
					sum0.add(nums[right]);
					result.add(sum0);
					left++;
					right--;
					while(left < right && nums[left] == nums[left - 1]) {
						left++; // skip duplicate
					}
					while(left < right && nums[right] == nums[right + 1]) {
						right--; //skip duplicate
					}
				} else if(sum < 0) {
					left++;
				} else {
					right--;
				}
			}
		}
		return result;		
	}
}
