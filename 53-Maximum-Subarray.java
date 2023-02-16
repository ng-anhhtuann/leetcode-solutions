class Solution {
    public int maxSubArray(int[] a) {
        int n = a.length;
        int res = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            res = sum > res ? sum : res;
            sum = sum < 0 ? 0 : sum;
        }
        return res;
    }
}