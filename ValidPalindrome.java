
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while(i < j) {
			while(!isCharacter(s.charAt(i)) && i < j) {
				i++;
			}
			while(!isCharacter(s.charAt(j)) && i < j) {
				j--;
			}
			char ichar = Character.toLowerCase(s.charAt(i));
			char jchar = Character.toLowerCase(s.charAt(j));
			if(ichar != jchar) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	private boolean isCharacter(char c) {
		if(c >= 'A' && c <= 'Z') {
			return true;
		} else if(c >= 'a' && c <= 'z') {
			return true;
		} else if(c >= '0' && c <= '9') {
			return true;
		} else{
		    return false;
		}
	}
}
