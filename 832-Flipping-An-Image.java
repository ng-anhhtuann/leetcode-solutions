class Solution {
    public int[][] flipAndInvertImage(int[][] a) {
        int n = a.length;
        for ( int i = 0; i < n; i++ ){
            for ( int j = 0 ; j < n/2; j++){
                int curr = a[i][j];
                a[i][j] = a[i][n-1-j];
                a[i][n-1-j] = curr;
                a[i][j] = a[i][j] == 0 ? 1 : 0;
                a[i][n-1-j] = a[i][n-1-j] == 0 ? 1 : 0;
            }
            if (n % 2 != 0){
                int tmp = n/2;
                a[i][tmp] = a[i][tmp] == 0 ? 1 : 0;
            }
        }
        return a;
    }
}