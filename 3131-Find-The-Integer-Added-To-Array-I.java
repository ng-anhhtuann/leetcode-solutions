class Solution {
    public int addedInteger(int[] a, int[] b) {
        int m = 0;
        int n = 0;
        int k = a.length;
        for ( int i = 0 ; i < k ; i++ ){
            m += a[i];
            n += b[i];
        }
        return m < n ? (n-m)/k : (m-n)/k*(-1);
    }
}