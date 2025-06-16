class Solution {
    public int minimumTotal(List<List<Integer>> a) {
        int n = a.size();
        int res = a.get(0).get(0);
        int idx = 0;
        for (int i = 1; i < n; i++) {
            if (a.get(i).get(idx) < a.get(i).get(idx + 1)) {
                res += a.get(i).get(idx);
            } else {
                res += a.get(i).get(idx + 1);
                idx++;
            }
        }
        return res;
    }
}

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            dp[n - 1][i] = triangle.get(n - 1).get(i);
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + triangle.get(i).get(j);
            }
        }
        return dp[0][0];
    }
}

class Solution {
    public int minimumTotal(List<List<Integer>> tg) {
        int n = tg.size();
        int[][] d = new int[n][n];
        for (int i = 0; i < n; i++) {
            d[n - 1][i] = tg.get(n - 1).get(i);
        }
        for (int i = n - 2; i >= 0; i--)
            for (int j = 0; j <= i; j++)
                d[i][j] = Math.min(d[i + 1][j], d[i + 1][j + 1]) + tg.get(i).get(j);
        return d[0][0];
    }
}