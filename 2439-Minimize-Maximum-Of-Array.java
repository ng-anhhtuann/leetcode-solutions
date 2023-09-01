class Solution {
    public int minimizeArrayValue(int[] a) {
        long sum = 0, res = 0;
        for (int i = 0; i < a.length; ++i) {
            sum += a[i];
            res = Math.max(res, (sum + i) / (i + 1));
        }
        return (int)res;
    }
}