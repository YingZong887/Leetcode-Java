import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Subsets {
	/**
	 * back tracking
	 * @param nums
	 * @return
	 */
	public List<List<Integer>> subsets_BT(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(nums == null) {
			return result;
		}
		Arrays.sort(nums);
		List<Integer> list = new ArrayList<Integer>();
		helperBT(result, list, nums, 0);
		return result;
	}

	private void helperBT(List<List<Integer>> result, List<Integer> list, int[] nums, int start) {
		result.add(new ArrayList<Integer>(list));
		for(int i = start; i < nums.length; i++) {
			list.add(nums[i]);
			helperBT(result, list, nums, i + 1);
			list.remove(list.size() - 1);
		}
	}


	/**
	 * bit manipulation
	 * @param nums
	 * @return
	 */
	 public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		int length = nums.length;
		Arrays.sort(nums);
		for(int i = 0; i < (1<<length); i++) {
			List<Integer> subset = new ArrayList<Integer>();
			int index = i;
			for(int j = 0; j < length; j++) {
				if((index & 1) == 1) {
					subset.add(nums[j]);
				}
				index = index >> 1;
			}
			result.add(subset);
		}
		return result;
	 }
}
