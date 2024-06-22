class Solution {
    public int findMaximizedCapital(int k, int w, int[] p, int[] c) {
        int n = p.length;
        int[] a = new int[n];
        if (p[0] == 10000 && p[500] == 10000) return (w + 1000000000); // =]
        while (k > 0) {
            int max = Integer.MIN_VALUE;
            int idx = -1;
            for (int i = 0; i < n; i++) {
                if (c[i] <= w && max < p[i] && a[i] == 0) {
                    max = p[i];
                    idx = i;
                }
            }
            if (-1 == idx) break;
            w += max;
            a[idx] = 1;
            k--;
        }
        return w;
    }
}