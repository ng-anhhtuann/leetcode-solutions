class Solution {
    public int minTimeToVisitAllPoints(int[][] a) {
        int n = a.length;
        int res = 0;
        for ( int i = 0; i < n-1; i++) {
            int[] curr = a[i];
            int[] next = a[i+1];
            res += Math.max(Math.abs(curr[0] - next[0]), Math.abs(curr[1] - next[1]));
        }
        return res;
    }
}