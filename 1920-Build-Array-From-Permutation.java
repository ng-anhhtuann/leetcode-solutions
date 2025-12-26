public class Solution {
    public int[] buildArray(int[] a) {
        int n = a.length;
        int[] r = new int[n];
        for (int i = 0; i < n; i++)
            r[i] = a[a[i]];
        return r;
    }
}
