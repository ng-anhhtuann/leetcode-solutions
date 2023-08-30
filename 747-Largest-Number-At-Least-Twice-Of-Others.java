class Solution {
    public int dominantIndex(int[] a) {
        int n = a.length;

        int mx = 0;
        int subMx = 1;

        for (int i = 1; i < n; i++) {
            if (a[i] > a[mx]) {
                subMx = mx;
                mx = i;
            } else if (a[i] > a[subMx]) {
                subMx = i;
            }
        }
        if (a[subMx] == 0) return mx;
        return a[mx] / a[subMx] >= 2 ? mx : -1;
    }
}