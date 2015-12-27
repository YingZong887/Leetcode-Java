
public class HIndexII {
	public int hIndex(int[] citations) {
		if(citations == null || citations.length == 0) {
			return 0;
		}
		int length = citations.length;
		int start = 0;
		int end = length - 1;
		while(start + 1 < end) {
			int mid = start + (end - start) / 2;
			if(citations[mid] > length - mid) {
				end = mid;
			} else {
				start = mid;
			}
		}

		if(citations[start] >= length - start) {
			return length - start;
		} else if (citations[end] >= length - end) {
			return length - end;
		} else {
			return 0;
		}


	}
}
