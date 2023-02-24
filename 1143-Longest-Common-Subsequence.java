class Solution {
    public int longestCommonSubsequence(String a, String b) {
        int m = a.length();
        int n = b.length();
        int[][] tmp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    tmp[i][j] = tmp[i - 1][j - 1] + 1;
                } else {
                    tmp[i][j] = Math.max(tmp[i - 1][j], tmp[i][j - 1]);
                }
            }
        }
        return tmp[m][n];
    }
}