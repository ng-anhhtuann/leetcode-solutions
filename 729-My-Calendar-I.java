class MyCalendar {
    List<int[]> cal;
    public MyCalendar() {
        cal = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        for ( int[] i : cal ) {
            if (i[0] == start) return false;
            if (i[0] <= start && i[1] > start) return false;
            if (i[0] < end && i[1] >= end) return false;
            if (i[0] >= start && i[1] <= end) return false;
        }
        cal.add(new int[]{start, end});
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */

// 19-30 33-51 53-63 75-92 97-100

import java.util.*;

class MyCalendar {
    List<int[]> cal;
    public MyCalendar() {
        cal = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        for (int[] i : cal)
            if (start < i[1] && end > i[0]) return false;
        cal.add(new int[]{start, end});
        return true;
    }
}