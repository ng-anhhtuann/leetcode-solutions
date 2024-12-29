class Solution {
    // public int[] getMaximumXor(int[] a, int max) {
    // int n = a.length;
    // int[] res = new int[n];
    // int xor = 0;
    // int maxBit = 1 << max;
    // for ( int i : a ) xor ^= i;
    // int p = n-1;
    // for (int i = 0; i < n; i++) {
    // int tmp = xor;
    // int idx = 0;
    // for (int j = 0; j < maxBit; j++){
    // if ((xor ^ j) > tmp) {
    // tmp = xor ^ j;
    // idx = j;
    // }
    // }
    // res[i] = idx;
    // xor ^= a[p--];
    // }
    // return res;
    // }
    public int[] getMaximumXor(int[] a, int max) {
        int xor = 0;
        for (int i = 0; i < a.length; i++)
            xor = xor ^ a[i];
        int[] res = new int[a.length];

        int maxBit = (1 << max) - 1;

        for (int i = 0; i < a.length; i++) {
            res[i] = xor ^ maxBit;
            xor = xor ^ a[a.length - 1 - i];
        }

        return res;
    }
}