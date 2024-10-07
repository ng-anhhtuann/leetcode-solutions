class Solution {
    public long maxScore(int[] a, int[] b) {
        int len = b.length;
        long max = Long.MIN_VALUE;

        for (int k = 0; k < len - 3; k++) {
            for (int l = k + 1; l < len - 2; l++) {
                for (int m = l + 1; m < len - 1; m++) {
                    for (int n = m + 1; n < len; n++) {
                        long total = (long) a[0] * b[k] + a[1] * b[l] + a[2] * b[m] + a[3] * b[n];
                        max = Math.max(max, total);
                    }
                }
            }
        }

        return max;
    }
}