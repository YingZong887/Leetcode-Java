import static org.junit.Assert.*;

import org.junit.Test;

public class ProductOfArrayExceptSelfTest {

	@Test
	public void test() {
		ProductOfArrayExceptSelf a = new ProductOfArrayExceptSelf();
		int[] s = {1,0};
		int[] result = a.productExceptSelf(s);
	}

}
