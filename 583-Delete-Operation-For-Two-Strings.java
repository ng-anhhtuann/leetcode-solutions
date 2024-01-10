class Solution {
    /**
     Linear comparison
     */
    public static int minDistance(String a, String b) {
        int m = a.length(), n = b.length();
        int[][] w = new int[m+1][n+1];
        for (int i = 0; i <= m; i++) {
            w[i][0] = i;
        }
        for (int j = 0; j <= n; j++) {
            w[0][j] = j;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (a.charAt(i-1) == b.charAt(j-1)) {
                    w[i][j] = w[i-1][j-1];
                } else {
                    w[i][j] = Math.min(w[i-1][j], w[i][j-1]) + 1;
                }
            }
        }
        return w[m][n];
    }

}