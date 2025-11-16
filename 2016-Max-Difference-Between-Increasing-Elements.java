class Solution {
    public int maximumDifference(int[] a) {
        int n = a.length;
        int i = 0;
        int mx = -1;
        for (int j = 1; j < n; j++) {
            if (i < j && a[i] < a[j])
                mx = Math.max(mx, a[j] - a[i]);
            else
                i = j;
        }
        return mx;
    }
}