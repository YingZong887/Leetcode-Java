import java.util.ArrayList;
import java.util.List;

public class SummaryRange {
	public List<String> summaryRanges(int[] nums) {
		List<String> result = new ArrayList<String>();
		if(nums.length == 0){
			return result;
		}
		int start = 0;
		int end = 0;

		for(int i = 0; i < nums.length;i++){
			if(i + 1 < nums.length){
				if(nums[i + 1] != nums[i] + 1) {
					result.add(start == end? ""+ nums[start] : nums[start] + "->" + nums[end]);
					start = i + 1;
					end = i + 1;
				}
				else{
					end = i + 1;
				}
			}
			else{
				result.add(start == end? ""+ nums[start] : nums[start] + "->" + nums[end]);
			}

		}
		return result;
	}
}
