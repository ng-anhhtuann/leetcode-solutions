class Solution {

    long find(int[] a, int l, int r, int t) {
        while (l <= r) {
            int m = l + ((r - l) / 2);
            if (a[m] >= t)
                r = m - 1;
            else
                l = m + 1;
        }
        return l;
    }

    long countFairPairs(int[] a, int lower, int upper) {
        Arrays.sort(a);
        long ans = 0;
        for (int i = 0; i < a.length; i++) {
            long l = find(a, i + 1, a.length - 1, lower - a[i]);
            long r = find(a, i + 1, a.length - 1, upper - a[i] + 1);
            ans += 1 * (r - l);
        }
        return ans;
    }
}