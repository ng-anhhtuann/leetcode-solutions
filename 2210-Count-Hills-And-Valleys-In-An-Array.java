class Solution {
    public int countHillValley(int[] a) {
        int n = a.length;
        int count = 0;
        int prevPeak = a[0];
        for (int i = 1; i < n - 1; i++) {
            if (a[i] == a[i - 1] && a[i] == a[i + 1])
                continue;
            if ((a[i] > prevPeak && a[i] > a[i + 1]) || (a[i] < prevPeak && a[i] < a[i + 1])) {
                count++;
                prevPeak = a[i];
            }
        }
        return count;
    }
}