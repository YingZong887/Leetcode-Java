import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MeetingRoomsII {
	public int minMeetingRooms(Interval[] intervals) {
		if(intervals == null || intervals.length == 0) { 
			return 0;
		}
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		Arrays.sort(intervals, new IntervalComparator());
		pq.offer(intervals[0].end);
		for(int i = 1; i < intervals.length; i++) {
			if(intervals[i].start >= pq.peek()) {
				pq.poll();
			}
			pq.offer(intervals[i].end);				

		}
		return pq.size();
	}

	class IntervalComparator implements Comparator<Interval>{

		@Override
		public int compare(Interval int1, Interval int2) {
			return int1.start - int2.start;
		}

	}

	private class Interval {
		int start;
		int end;
		Interval() { start = 0; end = 0; }
		Interval(int s, int e) { start = s; end = e; }
	}
}
