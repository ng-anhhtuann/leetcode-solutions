class Solution {
    /**
     * =
     * = =
     * = = =
     * == ===
     * == ===
     */
    // public int trap(int[] h) {
    // int n = h.length;
    // int res = 0;
    // if (n == 1 || n == 2) return res;
    // for (int i = 0; i < n; i++) {
    // if (i == n - 1) break;
    // int l = h[i];
    // int j = i + 1;
    // while (j < n-1 && h[j] < l) {
    // j++;
    // }
    // int r = h[j];
    // if (l < r) {
    // int m = Math.min(l, r);
    // for (int k = i + 1; k < j; k++) {
    // if (m > h[k]) {
    // res += m - h[k];
    // }
    // }
    // i = j - 1;
    // }
    // }
    // return res;
    // }

    public int trap(int[] h) {
        int n = h.length;
        int res = 0;
        int ll = 0, rr = 0;
        int l = 0, r = n - 1;
        while (l < r) {
            if (h[l] < h[r]) {
                if (h[l] >= ll) {
                    ll = h[l];
                } else {
                    res += ll - h[l];
                }
                l++;
            } else {
                if (h[r] >= rr) {
                    rr = h[r];
                } else {
                    res += rr - h[r];
                }
                r--;
            }
        }
        return res;
    }
}