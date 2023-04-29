class Solution {
    /**
     * Memory beat 54%
     */
    public int findMin(int[] a) {
        int n = a.length - 1;
        if (n == 0)
            return a[n];
        int res = a[0];
        if (res < a[n]) {
            return res;
        } else {
            res = a[n];
        }
        n--;
        while (res > a[n]) {
            res = a[n];
            n--;
        }
        return res;
    }

    /**
     * Memory beat 60%
     */
    public int findMin(int[] a) {
        int res = a[0];
        int n = a.length - 1;
        while (res > a[n] && n > 0) {
            res = a[n--];
        }
        return res;
    }

    /**
     * Binary Search beat 89% memory
     */
    public int findMin(int[] a) {
        int l = 0, r = a.length - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a[m] > a[r]) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return a[l];
    }
}