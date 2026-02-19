class Solution {
    public long maximumTripletValue(int[] a) {
        int n = a.length;
        long max = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1 && a[i] - a[j] > 0; j++) {
                for (int k = j + 1; k < n && a[k] > 0; k++) {
                    max = Math.max(max, (long) (a[i] - a[j]) * a[k]);
                }
            }
        }
        return max;
    }
}