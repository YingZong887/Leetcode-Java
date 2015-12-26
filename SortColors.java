
public class SortColors {
	public void sortColors(int[] nums) {
		int indexWhite = 0, indexRed = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				nums[i] = 2;
				nums[indexWhite++] = 1;
				nums[indexRed++] = 0;
			} else if (nums[i] == 1) {
				nums[i] = 2;
				nums[indexWhite++] = 1;
			}
		}
	}
}
