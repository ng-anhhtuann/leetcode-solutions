class Solution {

    public int numSubmat(int[][] a) {
        int m = a.length;
        int n = a[0].length;
        int d = 0;
        int[][] r = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0)
                    r[i][j] = a[i][j];
                else
                    r[i][j] = a[i][j] == 0 ? 0 : r[i][j - 1] + 1;

                int c = r[i][j];
                for (int k = i; k >= 0; k--) {
                    c = Math.min(c, r[k][j]);
                    if (c == 0)
                        break;
                    d += c;
                }
            }
        }
        return d;
    }
}