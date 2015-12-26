import java.util.HashMap;
import java.util.HashSet;

public class PalindromePermutation {
	/**
	 * My solution
	 * @param s
	 * @return
	 */
	public boolean canPermutePalindrome(String s) {
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i = 0; i < s.length(); i++){
			char target = s.charAt(i);
			if(!map.containsKey(target)){
				map.put(target, 1);
			}
			else{
				int num = map.get(target);
				map.put(target, num+1);
			}
		}
		int sum = 0;
		for(int i : map.values()){
			if(i%2 == 1){
				sum++;
			}
			if(sum > 1){
				return false;
			}
		}		
		return true;
	}
	/**
	 * use Hashset
	 * @param s
	 * @return
	 */
	
	public boolean canPermutePalindrome_Set(String s){
		HashSet<Character> set = new HashSet<Character>();
		for(int i = 0; i < s.length();i++){
			char target = s.charAt(i);
			if(!set.contains(target)){
				set.add(target);
			}
			else{
				set.remove(target);
			}
		}
		return set.size()<=1;
	}
	/**
	 * use array to record the occurrence of a certain char
	 * @param s
	 * @return
	 */
	public boolean canPermutePalindrome_Array(String s){
		int[] record = new int[128];
		for(int i = 0; i < s.length(); i++){
			int num = (int) s.charAt(i);
			record[num]++;
		}
		int count = 0;
		for(int i : record){
			if(i%2 == 1){
				count++;
			}
			if(count > 1){
				return false;
			}
		}
		return true;
	}

}
