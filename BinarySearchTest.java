import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void testBS_iteration() {
		BinarySearch a = new BinarySearch();
		int[] num = {1,2,5,6,8,9,10,13,15};
		assertEquals(2,a.BS_iteration(num, 5));
		assertEquals(0,a.BS_iteration(num, 1));
		assertEquals(-1,a.BS_iteration(num, 4));
		assertEquals(5,a.BS_iteration(num, 9));
		assertEquals(8,a.BS_iteration(num, 15));
	}
	
	public void testBS_recursion() {
		BinarySearch a = new BinarySearch();
		int[] num = {1,2,5,6,8,9,10,13,15};
		int end = num.length - 1;
		assertEquals(2,a.BS_recursion(num, 0, end, 5));
		assertEquals(0,a.BS_recursion(num,0, end, 1));
		assertEquals(-1,a.BS_recursion(num,0, end, 4));
		assertEquals(5,a.BS_recursion(num, 0, end,9));
		assertEquals(8,a.BS_recursion(num, 0, end,15));
	}

}
