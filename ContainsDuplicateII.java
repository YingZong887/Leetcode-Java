import java.util.HashMap;

public class ContainsDuplicateII {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		if(nums == null || k <= 0){
			return false;
		}
		k = Math.min(k, nums.length-1);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums.length; i++){
			if(map.containsKey(nums[i])){
				int pre = map.get(nums[i]);
				if(i - pre <= k){
					return true;
				}
			}

			map.put(nums[i],i);
		}
		return false;
	}
}
