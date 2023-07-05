class Solution {
    public int minPathSum(int[][] a) {
        int m = a.length;
        int n = a[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i == 0 && j == 0) a[i][j] = a[i][j];
                else if(i == 0 && j != 0) a[i][j] = a[i][j] + a[i][j - 1];
                else if(j == 0 && i != 0) a[i][j] = a[i][j] + a[i - 1][j];
                else a[i][j] = a[i][j] + Math.min(a[i - 1][j], a[i][j - 1]);
            }
        }
        return a[m - 1][n - 1];
    }
}