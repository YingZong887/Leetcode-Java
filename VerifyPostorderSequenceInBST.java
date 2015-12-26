
public class VerifyPostorderSequenceInBST {
	public boolean verifyPostorder(int[] nums) {
		int i = nums.length;
		int root = Integer.MAX_VALUE;
		for (int j = nums.length - 1; j >= 0; j--)
		{
			if (nums[j] > root) return false;
			while (i <= nums.length - 1 && nums[j] > nums[i])
				root = nums[i++];
			nums[--i] = nums[j];
		}
		return true;

	}
}
