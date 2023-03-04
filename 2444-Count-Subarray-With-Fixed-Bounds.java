class Solution {
    public long countSubarrays(int[] a, int min, int max) {
        long res = 0, tmp = -1, l = -1, r = -1, n = a.length;
        for (int i = 0; i < n; ++i) {
            if (a[i] < min || a[i] > max)
                tmp = i;
            if (a[i] == min)
                l = i;
            if (a[i] == max)
                r = i;
            res += Math.max(0L, Math.min(l, r) - tmp);
        }
        return res;
    }
}
