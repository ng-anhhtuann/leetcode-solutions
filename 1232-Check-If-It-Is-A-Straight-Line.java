class Solution {
    public boolean checkStraightLine(int[][] a) {
        int n = a.length;
        if ( n == 2) return true;
        int lm = a[1][0], rm = a[1][1];
        int ll = a[0][0], rr = a[0][1];
        int l = -(rr - rm), r = ll - lm;
        for ( int i = 2 ; i < n; i++){
            int left = a[i][0], right = a[i][1];
            if ( l*(left-ll)+r*(right-rr) != 0 ){
                return false;
            }
        }
        return true;
    }
}