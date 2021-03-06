
public class OneEditDistance {
	public boolean isOneEditDistance(String s, String t) {
		if(s == null || t == null) {
			return false;
		}
		int lenMin = Math.min(s.length(), t.length());
		for(int i = 0; i < lenMin; i++) {
			if(s.charAt(i) != t.charAt(i)) {
				if(s.length() == t.length()) {
					return s.substring(i + 1).equals(t.substring(i + 1));
				} else if(s.length() > t.length()) {
					return s.substring(i + 1).equals(t.substring(i));
				} else {
					return s.substring(i).equals(t.substring(i + 1));
				}
			}
		}
		return Math.abs(s.length() - t.length()) == 1;
	}
}
