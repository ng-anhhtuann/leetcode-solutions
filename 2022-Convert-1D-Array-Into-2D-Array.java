class Solution {
    public int[][] construct2DArray(int[] a, int m, int n) {
        int len = a.length;
        if ( m * n != len ) return new int[0][0];
        int[][] res = new int[m][n];
        int row = 0, col = 0;
        for ( int i = 0 ; i < len; i++ ) {
            if (col == n ) {
                col = 0;
                row++;
            }
            res[row][col++] = a[i];
        }
        return res;
    }
}