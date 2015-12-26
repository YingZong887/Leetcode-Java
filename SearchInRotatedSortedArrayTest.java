import static org.junit.Assert.*;

import org.junit.Test;

public class SearchInRotatedSortedArrayTest {

	@Test
	public void test() {
		int[] nums = {5,1,3};
		int target = 5;
		SearchInRotatedSortedArray a = new SearchInRotatedSortedArray();
		assertEquals(0,a.search(nums, target));
	}

}
