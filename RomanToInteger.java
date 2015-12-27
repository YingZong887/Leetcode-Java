
public class RomanToInteger {
	public int romanToInt(String s) {
		int sum = 0;
		for (int i = 0; i < s.length() - 1; i++){
			char decimal = s.charAt(i);
			char decimal_next = s.charAt(i + 1);
			int num = r2i(decimal);
			int num_next = r2i(decimal_next);
			if(num < num_next){
				sum -= num;
			}
			else{
				sum += num;
			}

		}
		sum += r2i(s.charAt(s.length() - 1));
		return sum;


	}

	public int r2i(char r){
		switch(r){
		case 'I': return 1;
		case 'V': return 5;
		case 'X': return 10;
		case 'L': return 50;
		case 'C': return 100;
		case 'D': return 500;
		case 'M': return 1000;
		default : return 0;
		}
	}
}
