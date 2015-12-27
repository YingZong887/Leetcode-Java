
public class RemoveElement {
	public int removeElement(int[] nums, int val) {
		int newEnd = 0;
		for(int i = 0;i < nums.length;i++){
			if(nums[i] != val){
				nums[newEnd] = nums[i];
				newEnd++;
			}
		}
		return newEnd;

	}
}
