class Solution {
    public int[] decrypt(int[] a, int k) {
        int n = a.length;
        int[] res = new int[n];
        if (k == 0)
            return res;

        boolean isNegav = k < 0;
        int absK = Math.abs(k);

        for (int i = 0; i < absK; i++) {
            res[0] += isNegav ? a[(n + i + k) % n] : a[(i + 1) % n];
        }

        for (int i = 1; i < n; i++) {
            if (isNegav) {
                res[i] = res[i - 1]
                        - a[(n + i + k - 1) % n]
                        + a[(n + i + k - 1 + absK) % n];
            } else {
                res[i] = res[i - 1]
                        - a[(i) % n]
                        + a[(i + absK) % n];
            }
        }

        return res;
    }
}