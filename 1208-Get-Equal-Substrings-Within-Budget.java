class Solution {
    public int equalSubstring(String s, String t, int mx) {
        int n = s.length();
        int sz = 0;
        int dept = 0;
        int l = 0;

        int[] a = new int[n];
        char[] chs = s.toCharArray();
        char[] cht = t.toCharArray();
        for (int i = 0 ; i < n; i++)
            a[i] = Math.abs(chs[i] - cht[i]);

        for (int r = 0; r < n; r++) {
            dept += a[r];

            while (dept > mx) {
                dept -= a[l];
                l++;
            }

            sz = Math.max(sz, r - l + 1);
        }
        return sz;
    }
}