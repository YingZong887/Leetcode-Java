import java.util.*;

public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> result = new ArrayList<List<String>>();
		if(strs == null || strs.length == 0) {
			return result;
		}
		
		HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		for(String s : strs) {
			char[] copy = s.toCharArray();
			Arrays.sort(copy);
			String sorted = new String(copy);
			if(!map.containsKey(sorted)) {
				List<String> list = new ArrayList<String>();
				list.add(s);
				map.put(sorted, list);
			} else {
				map.get(sorted).add(s);
			}
		}
		for(List<String> l : map.values()) {
			Collections.sort(l);
			result.add(l);
		}
		return result;
	}
}
