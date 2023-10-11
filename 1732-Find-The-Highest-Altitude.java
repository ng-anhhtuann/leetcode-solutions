class Solution {
    public int largestAltitude(int[] a) {
        int n = a.length;
        int max = 0;
        int tmp = 0;
        for ( int i = 0 ; i < n; i++ ){
            tmp += a[i];
            max = max > tmp ? max : tmp;
        }
        return max;
    }
}