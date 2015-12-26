import java.util.ArrayList;
import java.util.HashMap;

public class TwoSumIII {
	ArrayList<Integer> num = new ArrayList<Integer>();
	
    // Add the number to an internal data structure.
	public void add(int number) {
	    num.add(number);
	}

    // Find if there exists any pair of numbers which sum is equal to the value.
	public boolean find(int value) {
		if(num.size() < 2) {
			return false;
		}
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < num.size(); i++){
			if(map.containsKey(num.get(i))) {
				return true;
			}
			map.put(value-num.get(i), i);
		
		}
		return false;
	}
}


// Your TwoSum object will be instantiated and called as such:
// TwoSum twoSum = new TwoSum();
// twoSum.add(number);
// twoSum.find(value);