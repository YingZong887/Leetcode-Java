
public class FirstBadVersion {
	/**
	 * You are given an API bool isBadVersion(version) which will return whether version is bad.
	 * Binary Search
	 * @param n
	 * @return
	 */
	public int firstBadVersion(int n) {
		int start = 1;
		int end = n;
		while(start + 1 < end) {
			int mid = (end - start) / 2 + start; //Because (low + high) may exceed the range of Integer.
			if(isBadVersion(mid)) {
				end = mid;
			} else {
				start = mid;
			}
		}
		if(isBadVersion(start)) return start;
		return end;
	}
	
	public boolean isBadVersion(int i) {
		return true;
	}
}
