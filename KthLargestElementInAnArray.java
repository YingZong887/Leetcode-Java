
public class KthLargestElementInAnArray {
	private int qselect(int[] s, int a, int b, int k) {
		if (a == b)
			return s[a];
		int m = s[(a+b)>>1], i = a-1, j = b+1, temp;
		while (true) {
			while (m > s[++i]);
			while (m < s[--j]);
			if (i >= j) break;
			temp = s[i];
			s[i] = s[j];
			s[j] = temp;
		}
		if (i == j) i++;
		return k <= i ? qselect(s, a, j, k) : qselect(s, i, b, k);
	}
	
	public int findKthLargest(int[] num, int k) {
		return qselect(num, 0, num.length-1, num.length-k+1);
	}
}
