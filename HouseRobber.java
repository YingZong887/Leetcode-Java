import java.util.List;

/**
 * Created by yingzong on 11/5/15.
 */
public class HouseRobber {
	public int rob(int[] nums) {
		if(nums.length < 1){
			return 0;
		}
		int[] sum = new int[nums.length + 1];
		sum[0] = 0;
		sum[1] = nums[0];

		for(int i = 2; i < nums.length + 1; i++){
			sum[i] = Math.max(sum[i - 1], sum[i - 2] + nums[i - 1]);
		}
		return sum[nums.length];
	}
}
