class Solution {
    public int[] getMaximumXor(int[] a, int max) {
        int n = a.length;
        int[] res = new int[n];
        int xor = 0;
        int maxBit = 1 << max;
        for (int i : a)
            xor ^= i;
        int p = n - 1;
        for (int i = 0; i < n; i++) {
            int tmp = xor;
            int idx = 0;
            for (int j = 0; j < maxBit; j++) {
                if ((xor ^ j) > tmp) {
                    tmp = xor ^ j;
                    idx = j;
                }
            }
            res[i] = idx;
            xor ^= a[p--];
        }
        return res;
    }
}