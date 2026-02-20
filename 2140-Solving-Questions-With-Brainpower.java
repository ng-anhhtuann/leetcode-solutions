class Solution {
    public long mostPoints(int[][] a) {
        int n = a.length;
        long[] dp = new long[n + 1];

        for (int i = n - 1; i >= 0; i--) {
            // System.out.println("i = " + i);
            long sum = a[i][0];
            int idx = i + a[i][1] + 1;
            if (idx <= n)
                sum += dp[idx];
            // System.out.println("sum = " + sum);
            // System.out.println("idx = " + idx);
            long skip = dp[i + 1];
            // System.out.println("skip = " + skip);
            dp[i] = Math.max(sum, skip);
            // log(dp);
            // System.out.println("_______________________");
        }

        return dp[0];
    }

    private void log(long[] a) {
        for (long i : a)
            System.out.print(i + " ");
        System.out.println();
    }
}
