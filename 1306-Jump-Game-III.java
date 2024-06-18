class Solution {
    public boolean canReach(int[] a, int k) {
        // positive
        int n = a.length;
        if (a[k] == -1)
            return false;
        if (a[k] == 0)
            return true;
        int l = k + a[k];
        int r = k - a[k];
        a[k] = -1;
        return (l < n && canReach(a, l)) || (r >= 0 && canReach(a, r));
    }
}