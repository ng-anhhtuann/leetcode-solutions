class Solution {
    public int maxAscendingSum(int[] a) {
        int n = a.length;
        int max = 0;
        int sum = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > a[i - 1])
                sum += a[i];
            else {
                max = Math.max(sum, max);
                sum = a[i];
            }
        }
        return Math.max(max, sum);
    }
}