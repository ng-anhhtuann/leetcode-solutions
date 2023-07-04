class Solution {
    public int numTrees(int n) {
        int [] a = new int[n+1];
        a[0]= 1; a[1] = 1;
        for(int i = 2; i <=n; i++)
            for(int j = 1; j<=i; j++)
                a[i] += a[i-j]*a[j-1];
        return a[n];
    }
}