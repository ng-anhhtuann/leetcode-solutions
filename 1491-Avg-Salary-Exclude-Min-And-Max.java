class Solution {
    public double average(int[] a) {
        int n = a.length;
        if (n == 1)
            return a[0];
        if (n == 2)
            return (double) (a[1] + a[0]) / 2;
        int sum = a[0];
        int min = a[0];
        int max = a[0];
        for (int i = 1; i < n; i++) {
            sum += a[i];
            max = a[i] > max ? a[i] : max;
            min = a[i] < min ? a[i] : min;
        }
        return (double) (sum - min - max) / (n - 2);
    }
}