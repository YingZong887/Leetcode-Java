import java.util.HashMap;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		int[] defaultResult = {0,0};
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0; i < nums.length; i++) {
			if(map.get(nums[i]) != null){
				int[] result = {map.get(nums[i])+1,i+1};
				return result;
			}
			map.put(target-nums[i], i);
		}	
		return defaultResult;
	}
}
