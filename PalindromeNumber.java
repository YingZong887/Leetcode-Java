
public class PalindromeNumber {
	/**
	 * reverse the number 
	 * @param x
	 * @return
	 */
	public boolean isPalindrome(int x){
		int rev = reverse(x);
		return rev == x;
	}
	public int reverse(int x){
		int result = 0;
		while(x != 0){
			result = result*10 + x%10;
			x = x/10;
		}
		return result;
	}
	
	public boolean isPalindrome_String(int x){
		if(x < 0){
			return false;
		}
		String s = Integer.toString(x);
		for(int i = 0; i <= s.length()/2; i++){
			if(s.charAt(i) != s.charAt(s.length()-1-i)){
				return false;
			}
		}
		return true;
	}


}
