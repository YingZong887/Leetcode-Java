
public class MultiplyStrings {
	public static void main(String[] args) {
		String s1 = "123";
		String s2 = "100";
		String s3 = multiply(s1,s2);
		System.out.println(s3);
	}

	public static String multiply(String num1, String num2) {
		if(num1 == null || num2 == null) {
			return null;
		}
		int len1 = num1.length();
		int len2 = num2.length();
		int[] pos = new int[len1 + len2];
		for(int i = len1 - 1; i >= 0; i--) {
			for(int j = len2 - 1; j >= 0; j--) {
				int p1 = i + j;
				int p2 = i + j + 1;
				int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
				int sum = pos[p2] + mul;
				pos[p1] += sum / 10;
				pos[p2] = sum % 10;
			}
		}

		StringBuilder sb = new StringBuilder();
		for(int p : pos) {
			if(!(sb.length() == 0 && p == 0)) {
				sb.append(p);
			}
		}

		return (sb.length() == 0 ? "0" : sb.toString());


	}
}
