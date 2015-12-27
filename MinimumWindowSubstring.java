
public class MinimumWindowSubstring {
	public String minWindow(String s, String t) {
		int[] sMap = new int[128]; 
		int[] tMap = new int[128];
		int start = 0;
		int end = 0; //[start, end)
		int min = Integer.MAX_VALUE;
		String result = "";
		
		for(char c : t.toCharArray()) {
			tMap[c]++;
		}
		
		while(start < s.length()) {
			//expand end
			while(end < s.length() && !sContainsT(sMap, tMap)) {
				sMap[s.charAt(end)]++;
				end++;
			}
			if(sContainsT(sMap, tMap) && min > end - start) {
				result = s.substring(start, end);
				min = end - start;
			}
			sMap[s.charAt(start)]--;
			start++;
		}
		return result;
	}
	
	private boolean sContainsT(int[] sMap,int[] tMap) {
		for(int i = 0; i < tMap.length; i++) {
			if(tMap[i] > sMap[i]) {
				return false;
			}
		}
		return true;
	}
}
