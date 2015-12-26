
public class AddBinary {
	public String addBinary(String a, String b) {
        int carry = 0;
        String result = "";
        for(int i = 0; i < Math.max(a.length(), b.length())-1; i++) {
        	int indexA = a.length() - 1 - i;
        	int indexB = b.length() - 1 - i;
        	int curA = (indexA >= 0 ? a.charAt(indexA) - '0' : 0);
        	int curB = (indexB >= 0 ? b.charAt(indexB) - '0' : 0);
        	result = (curA + curB + carry) % 2 + result;
        	carry = (curA + curB + carry) / 2;
        }
        if(carry == 1) {
        	result = "1" + result;
        }
        return result;
    }
}
