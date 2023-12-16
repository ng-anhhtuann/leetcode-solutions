class Solution {
    public int maxProduct(int[] a) {
        int n = a.length;
        int res = 0;
        for ( int i = 0 ; i < n-1 ; i++ ){
            for ( int j = i + 1 ; j < n ; j++ ){
                int temp = (a[i] - 1) * (a[j] - 1);
                res = res > temp ? res : temp;
            }
        }
        return res;
    }
}