class Solution {

    public int[][] restoreMatrix(int[] row, int[] col) {
        int n = row.length;
        int m = col.length;

        int[][] a = new int[n][m];
        int i = 0, j = 0;

        while (i < n && j < m) {
            a[i][j] = Math.min(row[i], col[j]);

            row[i] -= a[i][j];
            col[j] -= a[i][j];

            if (row[i] == 0) {
                i++;
            } else {
                j++;
            }
        }

        return a;
    }
}