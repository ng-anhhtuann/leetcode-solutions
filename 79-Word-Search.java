class Solution {
    public boolean exist(char[][] a, String w) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (dfs(a, w, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] a, String w, int i, int j, int k) {
        if (i < 0 || i >= a.length || j < 0 || j >= a[0].length || a[i][j] != w.charAt(k)) {
            return false;
        }
        if (k == w.length() - 1) {
            return true;
        }
        char tmp = a[i][j];
        a[i][j] = '#';
        boolean res = dfs(a, w, i - 1, j, k + 1) || dfs(a, w, i + 1, j, k + 1) ||
                dfs(a, w, i, j - 1, k + 1) || dfs(a, w, i, j + 1, k + 1);
        a[i][j] = tmp;
        return res;
    }
}

class Solution {
    public boolean exist(char[][] a, String w) {
        char[] arr = w.toCharArray();
        for (int y = 0; y < a.length; y++) {
            for (int x = 0; x < a[y].length; x++) {
                if (exist(a, y, x, arr, 0))
                    return true;
            }
        }
        return false;
    }

    private boolean exist(char[][] a, int y, int x, char[] w, int i) {
        if (i == w.length)
            return true;
        if (y < 0 || x < 0 || y == a.length || x == a[y].length)
            return false;
        if (a[y][x] != w[i])
            return false;
        a[y][x] ^= 256;
        boolean exist = exist(a, y, x + 1, w, i + 1)
                || exist(a, y, x - 1, w, i + 1)
                || exist(a, y + 1, x, w, i + 1)
                || exist(a, y - 1, x, w, i + 1);
        a[y][x] ^= 256;
        return exist;
    }
}