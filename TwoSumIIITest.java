import static org.junit.Assert.*;

import org.junit.Test;

public class TwoSumIIITest {

	@Test
	public void test() {
		TwoSumIII twoSum = new TwoSumIII();
		twoSum.add(1);
		twoSum.add(-1);
		assertEquals(true,twoSum.find(0));
	}

}
