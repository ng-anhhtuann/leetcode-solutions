class Solution {
    public void solve(char[][] a) {
        if (a.length == 0 || a[0].length == 0)
            return;
        if (a.length < 2 || a[0].length < 2)
            return;
        int m = a.length, n = a[0].length;
        for (int i = 0; i < m; i++) {
            if (a[i][0] == 'O')
                dfs(a, i, 0);
            if (a[i][n - 1] == 'O')
                dfs(a, i, n - 1);
        }
        for (int j = 0; j < n; j++) {
            if (a[0][j] == 'O')
                dfs(a, 0, j);
            if (a[m - 1][j] == 'O')
                dfs(a, m - 1, j);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 'O')
                    a[i][j] = 'X';
                else if (a[i][j] == '*')
                    a[i][j] = 'O';
            }
        }
    }

    private void dfs(char[][] a, int i, int j) {
        if (i < 0 || i > a.length - 1 || j < 0 || j > a[0].length - 1)
            return;
        if (a[i][j] == 'O')
            a[i][j] = '*';
        if (i > 1 && a[i - 1][j] == 'O')
            dfs(a, i - 1, j);
        if (i < a.length - 2 && a[i + 1][j] == 'O')
            dfs(a, i + 1, j);
        if (j > 1 && a[i][j - 1] == 'O')
            dfs(a, i, j - 1);
        if (j < a[i].length - 2 && a[i][j + 1] == 'O')
            dfs(a, i, j + 1);
    }
}