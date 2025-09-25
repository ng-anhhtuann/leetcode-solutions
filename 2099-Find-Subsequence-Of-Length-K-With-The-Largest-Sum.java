class Solution {

    public int[] maxSubsequence(int[] a, int k) {
        int n = a.length;
        int[][] d = new int[n][2];
        for (int i = 0; i < n; ++i) {
            d[i][0] = i;
            d[i][1] = a[i];
        }
        Arrays.sort(d, (x1, x2) -> Integer.compare(x2[1], x1[1]));
        Arrays.sort(d, 0, k, (x1, x2) -> Integer.compare(x1[0], x2[0]));
        int[] res = new int[k];
        for (int i = 0; i < k; ++i)
            res[i] = d[i][1];
        return res;
    }
}