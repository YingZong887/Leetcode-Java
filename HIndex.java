
public class HIndex {
	public int hIndex(int[] citations) {
		int length = citations.length;
		int total = 0;
		int[] arr = new int[length + 1]; //h 一定小于等于 length，最后一个装大于length - 1的引用数 arr[引用数] = 出现次数
		for(int i = 0; i < length; i++) {
			if(citations[i] > length) {
				arr[length]++;
			} else {
				arr[citations[i]]++;
			}
		}
		for(int i = length; i >= 0; i--) {
			total += arr[i];
			if(total >= i){
				return i;
			}
		}
		return 0;
	}
}
