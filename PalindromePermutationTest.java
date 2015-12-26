import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromePermutationTest {
	
	@Test
	public void testcanPermutePalindrome(){
		PalindromePermutation pp = new PalindromePermutation();
		String s1 = "abb";
		assertEquals(true,pp.canPermutePalindrome(s1));
		String s2 = "abbb";
		assertEquals(false,pp.canPermutePalindrome(s2));
		String s3 = "aabbggsso";
		assertEquals(true,pp.canPermutePalindrome(s3));
	}

	@Test
	public void testcanPermutePalindrome_Set(){
		PalindromePermutation pp = new PalindromePermutation();
		String s1 = "abb";
		assertEquals(true,pp.canPermutePalindrome_Set(s1));
		String s2 = "abbb";
		assertEquals(false,pp.canPermutePalindrome_Set(s2));
		String s3 = "aabbggsso";
		assertEquals(true,pp.canPermutePalindrome_Set(s3));	
	}
	
	@Test
	public void testcanPermutePalindrome_Array(){
		PalindromePermutation pp = new PalindromePermutation();
		String s1 = "abb";
		assertEquals(true,pp.canPermutePalindrome_Array(s1));
		String s2 = "abbb";
		assertEquals(false,pp.canPermutePalindrome_Array(s2));
		String s3 = "aabbggsso";
		assertEquals(true,pp.canPermutePalindrome_Array(s3));
	}
}
