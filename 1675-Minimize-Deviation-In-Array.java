class Solution {
    public int minimumDeviation(int[] a) {
        Queue<Integer> q = new PriorityQueue<Integer>();
        int n = a.length, min = Integer.MAX_VALUE, res = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 1)
                a[i] *= 2;
            q.add(-a[i]);
            min = min < a[i] ? min : a[i];
        }
        while (true) {
            int i = -q.poll();
            res = res < i - min ? res : i - min;
            if (i % 2 == 1)
                break;
            min = min < i / 2 ? min : i / 2;
            q.add(-i / 2);
        }
        return res;
    }
}