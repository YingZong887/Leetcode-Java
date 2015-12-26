import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by yingzong on 11/4/15.
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(!set.add(nums[i])){
                set.remove(nums[i]);
            }
        }
        Iterator<Integer> setIterator = set.iterator();
        return setIterator.next();

    }

    public static void main(String[] args) {
        SingleNumber a = new SingleNumber();
        int[] nums = new int[]{1,2,3,4,5,6,7,1,2,3,4,5,6,7,8};
        System.out.println(a.singleNumber(nums));


    }
}
