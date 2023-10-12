class Solution {
    public int sumOddLengthSubarrays(int[] a) {
        int n = a.length;
        int sum = 0;
        int step = 1;
        while ( step <= n ){
            for ( int i = 0 ; i < n-step+1; i++){
                for ( int j = i ; j < step+i; j++){
                    sum+= a[j];
                }
            }
            step+=2;
        }
        return sum;
    }
}