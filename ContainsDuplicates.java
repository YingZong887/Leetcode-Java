import java.util.HashSet;

public class ContainsDuplicates {
	public boolean containsDuplicate(int[] nums) {
		if(nums == null){
			return false;
		}

		HashSet<Integer> num = new HashSet<Integer>();
		for(int i : nums){
			if(!num.add(i)){
				return true;
			}
		}
		return false;
	}
}
