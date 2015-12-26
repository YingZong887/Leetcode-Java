import java.util.HashMap;

public class StrobogrammaticNumber {
	public boolean isStrobogrammatic(String num) {
		HashMap<Character,Character> map = new HashMap<Character,Character>();
		map.put('0','0');
		map.put('1','1');
		map.put('6','9');
		map.put('8','8');
		map.put('9','6');
		for(int i = 0; i <= num.length()/2; i++){
			char cur = num.charAt(i);
			if(!map.containsKey(cur) || map.get(cur) != num.charAt(num.length()-1-i)){
				return false;
			}
		}
		return true;

	}
}
