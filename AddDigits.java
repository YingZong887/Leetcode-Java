
public class AddDigits {
	/**
	 * wiki digital root. O(1)
	 * @param num
	 * @return
	 */
	public int addDigits(int num) {
        return num - ((num-1)/9)*9;
    }
}
