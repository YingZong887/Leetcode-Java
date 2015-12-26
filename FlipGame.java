import java.util.ArrayList;
import java.util.List;

public class FlipGame {
	public List<String> generatePossibleNextMoves(String s) {
		List<String> result = new ArrayList<String>();
		for(int i = 0; i < s.length()-1; i++){
			if(s.charAt(i) == '+' && s.charAt(i+1) == '+'){
				String s1 = s.substring(0,i) + "--" + s.substring(i+2);
				result.add(s1);
			}
		}
		return result;
	}
}
