class Solution {
    public int maxProfit(int[] a) {
        int n = a.length;
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            } else if (a[i] - min > max) {
                max = a[i] - min;
            }
        }
        return max;
    }
}