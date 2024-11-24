class Solution {

    public int countSquares(int[][] a) {
        int row = a.length, col = a[0].length;
        int[][] dp = new int[row + 1][col + 1];
        int ans = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (a[i][j] == 1) {
                    dp[i + 1][j + 1] = Math.min(Math.min(dp[i][j + 1], dp[i + 1][j]), dp[i][j]);
                    dp[i + 1][j + 1]++;
                    ans += dp[i + 1][j + 1];
                }
            }
        }
        return ans;
    }
}