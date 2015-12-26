import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeNumberTest {

	@Test
	public void isPalindrometest() {
		PalindromeNumber a = new PalindromeNumber();
		assertEquals(false, a.isPalindrome(321));
		assertEquals(false, a.isPalindrome(32121));
		assertEquals(true, a.isPalindrome(32123));
		assertEquals(true, a.isPalindrome(1));
	}
	
	@Test
	public void isPalindrometest_String() {
		PalindromeNumber a = new PalindromeNumber();
		assertEquals(false, a.isPalindrome_String(321));
		assertEquals(false, a.isPalindrome_String(32121));
		assertEquals(true, a.isPalindrome_String(32123));
		assertEquals(true, a.isPalindrome(1));
	}

}
