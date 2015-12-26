import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Subsets {
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
