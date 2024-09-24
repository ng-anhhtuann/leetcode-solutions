class Solution {
    public double maxProbability(int n, int[][] e, double[] prob, int start, int end) {
        double[] dp = new double[n];
        dp[start] = 1.0;

        for (int i = 0; i < n - 1; i++) {
            boolean hasUpdate = false;
            for (int j = 0; j < e.length; j++) {
                int u = e[j][0];
                int v = e[j][1];
                double path = prob[j];
                if (dp[u] * path > dp[v]) {
                    dp[v] = dp[u] * path;
                    hasUpdate = true;
                }
                if (dp[v] * path > dp[u]) {
                    dp[u] = dp[v] * path;
                    hasUpdate = true;
                }
            }
            if (!hasUpdate) {
                break;
            }
        }

        return dp[end];
    }
}