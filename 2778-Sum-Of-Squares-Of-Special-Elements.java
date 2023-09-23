class Solution {
    public int sumOfSquares(int[] a) {
        int res = 0;
        int len = a.length;
        for ( int i = 0; i < len; i++){
            if ( len % (i+1) == 0 ){
                res += a[i]*a[i];
            }
        }
        return res;
    }
}