class Solution {
    public int maxDistance(int[][] a) {
        int m = a.length;
        int n = a[0].length;
        int max = m + n + 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 1) {
                    a[i][j] = 0;
                } else {
                    a[i][j] = max;
                    int l = i > 0 ? a[i - 1][j] + 1 : max;
                    int r = j > 0 ? a[i][j - 1] + 1 : max;
                    int tmp = Math.min(l, r);
                    a[i][j] = Math.min(a[i][j], tmp);
                }
            }
        }
        int res = Integer.MIN_VALUE;
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int l = i < m - 1 ? a[i + 1][j] + 1 : max;
                int r = j < n - 1 ? a[i][j + 1] + 1 : max;
                int tmp = Math.min(l, r);
                a[i][j] = Math.min(a[i][j], tmp);
                res = Math.max(res, a[i][j]);
            }
        }
        return res == 0 || res == max ? -1 : res;
    }
};