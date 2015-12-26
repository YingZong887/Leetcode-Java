import static org.junit.Assert.*;

import org.junit.Test;

public class MedianOfTwoSortedArraysTest {

	@Test
	public void test() {
		int[] nums1 = {1};
		int[] nums2 = {1};
		MedianOfTwoSortedArrays a = new MedianOfTwoSortedArrays();
		assertEquals(1, MedianOfTwoSortedArrays.findkth(nums1, 0, nums2, 0, 1));
		assertEquals(1.0, a.findMedianSortedArrays(nums1, nums2),0.005);
	}

}
