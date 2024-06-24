class Solution {
    public int maxSatisfied(int[] c, int[] g, int m) {
        int n = c.length;
        int res = 0, idx = 0, maxSum = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            idx++;
            if (g[i] == 0) res += c[i];
            else sum += c[i];

            if (idx == m) {
                idx--;
                if (i - m >= 0 && g[i - m] == 1) sum -= c[i - m];
                maxSum = maxSum > sum ? maxSum : sum;
            }
        }
        return maxSum + res;
    }
}