class Solution {
    public int minSubArrayLen(int s, int[] a) {
        int n = a.length;
        if (n == 0)
            return 0;
        int res = Integer.MAX_VALUE;
        int p = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            while (sum >= s) {
                res = Math.min(res, i + 1 - p);
                sum -= a[p++];
            }
        }
        return (res != Integer.MAX_VALUE) ? res : 0;
    }
}
