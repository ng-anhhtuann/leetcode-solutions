class Solution {
    public int minOperations(int[] a) {
        int n = a.length;
        int c = 0;

        for (int i = 0; i <= n - 3; i++) {
            if (a[i] == 0) {
                a[i] ^= 1;
                a[i + 1] ^= 1;
                a[i + 2] ^= 1;
                c++;
            }
        }
        for (int num : a)
            if (num == 0)
                return -1;
        return c;
    }
}