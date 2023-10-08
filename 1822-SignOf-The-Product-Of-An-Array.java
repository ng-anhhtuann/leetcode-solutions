class Solution {
    public int arraySign(int[] a) {
        int n = a.length;
        int cnt = 0;
        for ( int i = 0 ; i < n ; i++){
            if ( a[i] == 0 ) return 0;
            if ( a[i] < 0 ) cnt++;
        }
        return cnt % 2 == 1 ? -1 : 1;
    }
}