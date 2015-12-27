
public class IntegerToEnglishWords {
	String[] s = {"", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine ", "Ten ", "Eleven ", "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ", "Nineteen ", "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety "};
	String[] s2 = {""};

	public String numberToWords(int num) {
		if(num == 0) {
			return "Zero";
		}
		StringBuilder sb = new StringBuilder();
		//billion
		if(num / 1000000000 > 0) {
			int billionDigits = num / 1000000000;
			sb.append(numberToWords3(billionDigits) + "Billion ");
			num %= 1000000000;
		}
		//million
		if(num / 1000000 > 0) {
			int millionDigits = num / 1000000;
			sb.append(numberToWords3(millionDigits) + "Million ");
			num %= 1000000;
		}
		//thousand
		if(num / 1000 > 0) {
			int thousandDigits = num / 1000;
			sb.append(numberToWords3(thousandDigits) + "Thousand ");
			num %= 1000;
		}
		//one
		if(num > 0) {
			sb.append(numberToWords3(num));
		}

		return sb.deleteCharAt(sb.length()-1).toString();


	}
	public String numberToWords3(int num) {
		StringBuilder sb = new StringBuilder();
		if(num > 99) {
			sb.append(s[num / 100] + "Hundred ");
			num = num % 100;
		}
		if(num % 100 >= 0 && num % 100 < 20) {
			sb.append(s[num]);
			return sb.toString();
		} else {
			int n1 = num / 10 + 18;
			int n2 = num % 10;
			sb.append(s[n1]);
			sb.append(s[n2]);
			return sb.toString();
		}
	}
}
