
public class ShortestWordDistance {
	public int shortestDistance(String[] words, String word1, String word2) {
		int min = words.length - 1;
		int index = -1;
		for(int i = 0; i < words.length; i++){
			if(words[i].equals(word1) || words[i].equals(word2)){
				if(index != -1 && !words[index].equals(words[i])){
					min = Math.min(min, i-index);					
				}
				index = i;
			}
		}
		return min;
	}
}
