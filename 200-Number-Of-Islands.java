class Solution {
    public int numIslands(char[][] a) {
        int count = 0;
        int m = a.length;
        int n = a[0].length;
        if (m == 0 || n == 0)
            return 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == '1') {
                    count++;
                    area(a, i, j, m, n);
                }
            }
        }
        return count;
    }

    private void area(char[][] a, int i, int j, int m, int n) {
        if (i < 0 || i >= m || j < 0 || j >= n || a[i][j] != '1')
            return;
        a[i][j] = '0';
        area(a, i + 1, j, m, n);
        area(a, i - 1, j, m, n);
        area(a, i, j + 1, m, n);
        area(a, i, j - 1, m, n);
    }
}
