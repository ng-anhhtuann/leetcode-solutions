class Solution {

    public int numMagicSquaresInside(int[][] a) {
        int ans = 0;
        int m = a.length;
        int n = a[0].length;
        for (int row = 0; row + 2 < m; row++) {
            for (int col = 0; col + 2 < n; col++) {
                if (isMagicSquare(a, row, col)) {
                    ans++;
                }
            }
        }
        return ans;
    }

    private boolean isMagicSquare(int[][] a, int row, int col) {
        boolean[] seen = new boolean[10];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int num = a[row + i][col + j];
                if (num < 1 || num > 9) return false;
                if (seen[num]) return false;
                seen[num] = true;
            }
        }

        int d1 =
            a[row][col] + a[row + 1][col + 1] + a[row + 2][col + 2];
        int d2 =
            a[row + 2][col] + a[row + 1][col + 1] + a[row][col + 2];

        if (d1 != d2) return false;

        int row1 = a[row][col] + a[row][col + 1] + a[row][col + 2];
        int row2 =
            a[row + 1][col] +
                a[row + 1][col + 1] +
                a[row + 1][col + 2];
        int row3 =
            a[row + 2][col] +
                a[row + 2][col + 1] +
                a[row + 2][col + 2];

        if (!(row1 == d1 && row2 == d1 && row3 == d1)) {
            return false;
        }

        int col1 = a[row][col] + a[row + 1][col] + a[row + 2][col];
        int col2 =
            a[row][col + 1] +
                a[row + 1][col + 1] +
                a[row + 2][col + 1];
        int col3 =
            a[row][col + 2] +
                a[row + 1][col + 2] +
                a[row + 2][col + 2];

        if (!(col1 == d1 && col2 == d1 && col3 == d2)) {
            return false;
        }

        return true;
    }
}