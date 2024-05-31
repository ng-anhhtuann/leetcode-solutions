class Solution {
    public int subsetXORSum(int[] a) {
        int sum = 0;
        int n = a.length;
        int total = 1 << n;
        for ( int i = 0 ; i < total ; i++) {
            int tmp = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    tmp ^= a[j];
                }
            }
            sum+=tmp;
        }
        return sum;
    }

}