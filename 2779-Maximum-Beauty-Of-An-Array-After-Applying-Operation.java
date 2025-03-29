class Solution {
    public int maximumBeauty(int[] a, int k) {
        int n = a.length;
        int max = 0;
        for (int i : a)
            max = Math.max(max, i + k);
        int[] dp = new int[max + 1];
        for (int i : a) {
            int start = Integer.MAX_VALUE;
            int end = Integer.MIN_VALUE;
            start = (i - k < 0) ? 0 : i - k;
            end = i + k;
            for (int j = start; j <= end; j++)
                dp[j]++;
        }
        max = 0;
        for (int i : dp)
            max = Math.max(i, max);
        return max;
    }
}