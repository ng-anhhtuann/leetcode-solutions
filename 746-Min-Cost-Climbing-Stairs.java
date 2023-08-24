class Solution {
    public int minCostClimbingStairs(int[] a) {
        int n = a.length;
        if (n == 2) return Math.min(a[0], a[1]);
        int[] dp = new int[n];
        dp[0] = a[0]; dp[1] = a[1]; dp[2] = a[2];
        for ( int i = 2; i < n; i++){
            int firstPointer = dp[i-2];
            int secondPointer = dp[i-1];
            dp[i] = Math.min(a[i] + firstPointer, a[i] + secondPointer);
        }
        return Math.min(dp[n-2], dp[n-1]);
    }
}