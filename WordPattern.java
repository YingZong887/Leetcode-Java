import java.util.HashMap;

public class WordPattern {
	public boolean wordPattern(String pattern, String str) {
		if(pattern == null || str == null){
			return false;
		}
		String[] strs = str.split(" ");
		if(strs.length != pattern.length()){
			return false;
		}
		HashMap<Character, String> map = new HashMap<Character, String>();
		for(int i = 0; i < pattern.length(); i++){
			char c = pattern.charAt(i);
			String s = strs[i];
			if(!map.containsKey(c)){
				if(map.containsValue(s)){
					return false;
				}else{
					map.put(c, s);
				}
			}else{
				if(!s.equals(map.get(c))){
					return false;
				}
			}
		}
		return true;

	}
}
