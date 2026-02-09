class Solution {
    public int numberOfAlternatingGroups(int[] a, int k) {
        int n = a.length;
        int m = n + k - 1;
        int res = 0;
        int[] d = new int[m];
        for (int i = 0; i < n; i++) {
            d[i] = a[i];
            if (i < k - 1)
                d[i + n] = a[i];
        }
        int count = 1;
        for (int i = 1; i < m; i++) {
            if (d[i] != d[i - 1]) {
                count++;
                if (count == k) {
                    res++;
                    count--;
                }
            } else {
                count = 1;
            }
        }
        return count == k ? res + 1 : res;
    }
}
