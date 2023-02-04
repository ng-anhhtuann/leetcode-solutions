class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] a = new int[m][n];
        // fill a with max num
        for (int i = 0; i < m; i++) {
            Arrays.fill(a[i], Integer.MAX_VALUE - 1);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    a[i][j] = 0;
                } else {
                    if (i > 0) {
                        a[i][j] = Math.min(a[i][j], a[i - 1][j] + 1);
                    }
                    if (j > 0) {
                        a[i][j] = Math.min(a[i][j], a[i][j - 1] + 1);
                    }
                }
            }
        }
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (i < m - 1) {
                    a[i][j] = Math.min(a[i][j], a[i + 1][j] + 1);
                }
                if (j < n - 1) {
                    a[i][j] = Math.min(a[i][j], a[i][j + 1] + 1);
                }
            }
        }
        return a;
    }
}
