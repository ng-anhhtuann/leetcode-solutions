class Solution {
    public int[][] matrixReshape(int[][] a, int r, int c) {
        int m = a.length;
        int n = a[0].length;
        if(r*c != m*n)
            return a;
        int [][] ans = new int[r][c];
        for(int i = 0; i < r*c; i++)
            ans[i/c][i%c] = a[i/n][i%n];
        return ans;
    }
}