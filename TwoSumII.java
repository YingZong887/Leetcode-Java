/**
 * input array is sorted
 * @author yingzong
 *
 */
public class TwoSumII {
	public int[] twoSum(int[] numbers, int target) {
		int[] result = {0,0};
		if(numbers == null || numbers.length < 2) {
			return result;
		}
		int left = 0;
		int right = numbers.length-1;
		while(left < right) {
			int sum = numbers[left]+numbers[right];//use long to prevent overflow
			if(sum == target) {
				result[0] = left + 1;
				result[1] = right + 1;
				break;
			} else if(sum < target) {
				left++;
			} else {
				right--;
			}
		}
		return result;
	}
}
