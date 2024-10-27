class Solution {
    public int[] arrayRankTransform(int[] a) {
        int n = a.length;
        if ( n == 0 ) return new int[n];

        int[] t = new int[n];
        for (int i = 0; i < n; i++)
            t[i] = a[i];
        Arrays.sort(t);

        int[] tr = new int[n];
        tr[0]++;
        for ( int i = 1; i < n; i++)
            tr[i] = (t[i] != t[i-1]) ? tr[i-1]+1 : tr[i-1];

        int[] r = new int[n];
        for (int i = 0; i < n; i++){
            int idx = searchIndex(t, a[i]);
            r[i] = tr[idx];
        }

        return r;
    }

    private int searchIndex(int[] a, int dat) {
        int l = 0;
        int r = a.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] == dat) return m;
            else if (a[m] < dat) l = m + 1;
            else r = m - 1;
        }
        return -1;
    }
}