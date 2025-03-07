class Solution {
    public char[][] rotateTheBox(char[][] a) {
        int m = a.length;
        int n = a[0].length;
        char[][] d = new char[n][m];
        for (int i = 0; i < m; i++) {
            int g = m - i - 1;
            for (int j = 0; j < n; j++)
                d[j][g] = a[i][j];
        }

        for (int j = 0; j <= m - 1; j++) {
            for (int i = n - 1; i >= 0; i--) {
                if (d[i][j] == '.') {
                    int idx = i;
                    while (d[idx][j] == '.' && idx > 0)
                        idx--;
                    if (d[idx][j] == '#') {
                        d[i][j] = '#';
                        d[idx][j] = '.';
                    }
                }
            }
        }
        return d;
    }
}