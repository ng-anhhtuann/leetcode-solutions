class Solution {
    public void moveZeroes(int[] a) {
        int n = a.length;
        int count = 0;
        int j = 0;
        for ( int i = 0 ; i < n ; i++ ){
            if ( a[i] == 0 ){
                count++;
            } else {
                a[j] = a[i];
                j++;
            }
        }
        for ( int i = 0 ; i < count ; i++ ){
            a[j] = 0;
            j++;
        }
    }
}