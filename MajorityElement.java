import java.util.Arrays;

/**
 * Created by yingzong on 11/2/15.
 */
public class MajorityElement {
    /**
     * Moore voting algorithm
     * @param nums  input array
     * @return majority element
     */
    public int majorityElement_0(int[] nums) {
        if(nums.length < 1){
            return -1;
        }
        if(nums.length == 1) {
            return nums[0];
        }
        return 0;
    }


    /**
     * Simplest method. The middle one must be the majority element.
     * @param nums  input array
     * @return majority element
     */
    public int majorityElement_1(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
