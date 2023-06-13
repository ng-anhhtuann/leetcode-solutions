class Solution {
    public int equalPairs(int[][] a) {
        int res = 0;
        int n = a.length;
        for ( int i = 0 ; i < n; i++ ){
            res+=compare(a,a[i]);
        }
        return res;
    }
    public int compare(int[][] a, int[] t ){
        int n = a.length;
        int res = 0;
        for ( int i = 0 ; i < n ; i++ ){
            int tmp = 0;
            for ( int j = 0 ; j < n ; j++){
                if ( a[j][i] == t[j]){
                    tmp++;
                }
                if ( tmp == n ) {
                    res++;
                }
            }
        }
        return res;
    }
}