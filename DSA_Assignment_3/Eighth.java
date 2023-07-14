import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Interval {
      int start, end;
      Interval(int start, int end) {
          this.start = start;
          this.end = end;
      }
  }

public class Eighth {


    public boolean canAttendMeetings(List<Interval> intervals) {

        Collections.sort(intervals, (a, b) -> a.start - b.start);

        for (int i = 0; i + 1 < intervals.size(); i++) {
            if (intervals.get(i).end > intervals.get(i + 1).start) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Eighth e = new Eighth();
        int[][] a = {{0,30},{5,10},{15,20}};
        List<Interval> arrayList = new ArrayList<>();
        e.canAttendMeetings(arrayList);
    }
}