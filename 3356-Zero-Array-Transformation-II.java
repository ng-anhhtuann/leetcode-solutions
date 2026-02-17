class Solution {

    public int minZeroArray(int[] a, int[][] q) {
        int n = a.length, sum = 0, k = 0;
        int[] d = new int[n + 1];

        for (int i = 0; i < n; i++) {
            while (sum + d[i] < a[i]) {
                k++;

                if (k > q.length)
                    return -1;
                int l = q[k - 1][0], r = q[k - 1][1], val = q[k - 1][2];

                if (r >= i) {
                    d[Math.max(l, i)] += val;
                    d[r + 1] -= val;
                }
            }
            sum += d[i];
        }
        return k;
    }
}