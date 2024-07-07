class Solution {
    public int findCenter(int[][] a) {
        int l = a[0][0];
        int r = a[0][1];
        if (a[1][0] == l || a[1][1] == l) return l;
        if (a[1][0] == r || a[1][1] == r) return r;
        return 0;
    }
}