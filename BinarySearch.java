
public class BinarySearch {
	public int BS_iteration(int[] num, int target) {
		if(num == null) { 
			return -1;
		}
		int start = 0;
		int end = num.length - 1;
		
		while(start + 1 < end) {
			int mid = (end - start) / 2 + start; //Because (low + high) may exceed the range of Integer.
			if(num[mid] == target) { 
				return mid;
			} else if(num[mid] < target) {
				start = mid;
			} else {
				end = mid;
			}
		}
		if(num[start] == target) {
			return start;
		}
		if(num[end] == target) {
			return end;
		}
		
		return -1;
	}
	
	public int BS_recursion(int[] num, int start, int end, int target) {
		if(num == null || start < end) {
			return -1;
		}
		int mid = (start + end) / 2;
		if(num[mid] == target) {
			return mid;
		}
		
		if(num[mid] < target) {
			return BS_recursion(num, mid, end, target);
		} else {
			return BS_recursion(num, start, mid, target);
		}
		
		
	}
}
