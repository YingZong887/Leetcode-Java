
public class EditDistance {
	public int minDistance(String word1, String word2) {
		int len1 = word1.length();
		int len2 = word2.length();
		int[][] func = new int[len1 + 1][len2 + 2];
		//state: func[i][j] word1的前i个字符要edit几次才能让他与word2的前j个字符一致

		//initialize
		for(int i = 0; i < len1 + 1; i++) {
			func[i][0] = i;
		}
		for(int j = 0; j < len2 + 1; j++) {
			func[0][j] = j;
		}
		//function
		for(int i = 1; i < len1 + 1; i++) {
			for(int j = 1; j < len2 + 1; j++) {
				if(word1.charAt(i-1) == word2.charAt(j-1)) {
					func[i][j] = func[i-1][j-1];
				} else {
					func[i][j] = Math.min(func[i-1][j-1], Math.min(func[i-1][j], func[i][j-1])) + 1;
				}
			}
		}

		//answer
		return func[len1][len2];
	}
}
