class Solution {

    public int longestNiceSubarray(int[] a) {
        int uB = 0;
        int s = 0;
        int res = 0;

        for (int i = 0; i < a.length; ++i) {
            while ((uB & a[i]) != 0) {
                uB ^= a[s];
                s++;
            }
            uB |= a[i];
            res = Math.max(res, i - s + 1);
        }

        return res;
    }
}