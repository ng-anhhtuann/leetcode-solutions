public class Solution {
    public int maxEvents(int[][] a) {
        Arrays.sort(a, (k, l) -> k[0] - l[0]);
        int max = 0;
        for (int[] e : a)
            max = Math.max(max, e[1]);

        int d = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for ( int day = 1, i = 0; day <= max; day++) {
            while (i < a.length && a[i][0] <= day) {
                q.offer(a[i][1]);
                i++;
            }

            while ( !q.isEmpty() && q.peek() < day)
                q.poll();

            if (!q.isEmpty()) {
                q.poll();
                d++;
            }

        }
        return d;

    }
}{

}
