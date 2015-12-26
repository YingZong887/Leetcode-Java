import java.util.Arrays;


/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class MeetingRooms {
	public boolean canAttendMeetings(Interval[] intervals) {
		int[] starts = new int[intervals.length];
		int[] ends = new int[intervals.length];
		for(int i = 0; i < intervals.length; i++){
		    starts[i] = intervals[i].start;
		    ends[i] = intervals[i].end;
		}
		Arrays.sort(starts);
		Arrays.sort(ends);
		
		for(int i = 1; i < intervals.length; i++){
			if(starts[i]<ends[i-1]){
				return false;
			}
		}
		return true;
	}

	private class Interval {
		int start;
		int end;
		Interval() { start = 0; end = 0; }
		Interval(int s, int e) { start = s; end = e; }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MeetingRooms mr = new MeetingRooms();
		Interval mt1 = mr.new Interval(7,10);
		Interval mt2 = mr.new Interval(2,4);
		Interval[] intervals = new Interval[]{mt1,mt2};
		System.out.println(mr.canAttendMeetings(intervals));
	}

}
