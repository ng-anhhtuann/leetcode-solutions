class Solution {
    public int maximumCount(int[] a) {
        int n = a.length;
        int cNeg = 0;
        int cZ = 0;

        if ((a[0] < 0 && a[n - 1] < 0)
                || (a[0] > 0 && a[n - 1] > 0))
            return n;
        if (a[0] == 0 && a[n - 1] == a[0])
            return 0;

        for (int i = 0; i < n; i++) {
            if (a[i] < 0)
                cNeg++;
            else if (a[i] == 0)
                cZ++;
            else
                break;
        }

        return Math.max(cNeg, n - cZ - cNeg);
    }

    // public int maximumCount(int[] a) {
    // int pos = a.length - mtZero(a);
    // int neg = ltZero(a);

    // return Math.max(pos, neg);
    // }

    private int ltZero(int[] a) {
        int l = 0, r = a.length - 1;
        int i = a.length;

        while (l <= r) {
            int m = (l + r) / 2;

            if (a[m] < 0) {
                l = m + 1;
            } else if (a[m] >= 0) {
                r = m - 1;
                i = m;
            }
        }

        return i;
    }

    private int mtZero(int[] a) {
        int l = 0, r = a.length - 1;
        int i = a.length;

        while (l <= r) {
            int m = (l + r) / 2;

            if (a[m] <= 0) {
                l = m + 1;
            } else if (a[m] > 0) {
                r = m - 1;
                i = m;
            }
        }

        return i;
    }
}