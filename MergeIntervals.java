import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
	public List<Interval> merge(List<Interval> intervals) {
		java.util.Collections.sort(intervals, new Comparator<Interval>() {

			@Override
			public int compare(Interval int1, Interval int2) {
				return int1.start - int2.start;
			}

		});
		int i = 1;
		while(i < intervals.size()) {
			Interval int1 = intervals.get(i-1);
			Interval int2 = intervals.get(i);
			if(int1.end >= int2.start) {
				int newEnd = Math.max(int1.end, int2.end);
				int1.end = newEnd;
				intervals.remove(i);
			} else {
				i++;
			}
		}

		return intervals;
	}

	public class Interval {
		int start;
		int end;
		Interval() { start = 0; end = 0; }
		Interval(int s, int e) { start = s; end = e; }
	}
}
