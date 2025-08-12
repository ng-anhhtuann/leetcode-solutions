class Solution {

    public int maximumLength(int[] a, int k) {
        int[][] d = new int[k][k];
        int res = 0;
        for (int i : a) {
            i %= k;
            for (int j = 0; j < k; j++) {
                d[j][i] = d[i][j] + 1;
                res = Math.max(res, d[j][i]);
            }
        }
        return res;
    }
}