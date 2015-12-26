
public class CountAndSay {
	public String countAndSay(int n) {
		String s = "1";
		while(--n > 0) {
			StringBuilder sb = new StringBuilder();
			char[] charS = s.toCharArray();
			for(int i = 0; i < charS.length; i++) {
				int count = 1;
				while((i + 1) < charS.length && charS[i] == charS[i+1]) {
					count++;
					i++;
				}
				sb.append("" + count + charS[i]);
			}
			s = sb.toString();
		}		
		return s;
	}
}
