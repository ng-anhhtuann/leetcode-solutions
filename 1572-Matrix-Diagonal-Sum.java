class Solution {
    public int diagonalSum(int[][] a) {
        int m = a.length;
        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j || i + j == m - 1) {
                    res += a[i][j];
                }
            }
        }
        return res;
    }
}
