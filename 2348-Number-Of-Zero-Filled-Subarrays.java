class Solution {
    public long zeroFilledSubarray(int[] a) {
        long res = 0;
        int n = a.length;
        long count = 0;
        for ( int i = 0 ; i < n; i++){
            if ( a[i] == 0 ) count++;
            if ( a[i] != 0 || i == n-1){
                if ( count != 0){
                    res += count * (count+1) / 2;
                    count = 0;
                }
            }
        }
        return res;
    }
}