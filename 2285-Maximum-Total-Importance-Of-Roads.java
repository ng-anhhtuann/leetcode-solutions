class Solution {
    public long maximumImportance(int n, int[][] a) {
        long[] dp = new long[n];

        for (int[] o : a) {
            dp[o[0]]++;
            dp[o[1]]++;
        }
        // log(dp);

        Arrays.sort(dp);

        // log(dp);

        long val = 1;
        long sum = 0;
        for (long d : dp) {
            sum += (val * d);
            val++;
        }

        return sum;
    }

    private void log(long[] a) {
        for (long i : a) {
            System.out.print(i + " ");
        }
        System.out.println("_________________");
    }
}