class Solution {

    /**
     * O(n) memory
     */
    public int[] shuffle(int[] a, int s) {
        int[] res = new int[s * 2];
        int pos = 0;
        for (int i = 0; i < s; i++) {
            res[pos++] = a[i];
            res[pos++] = a[i + s];
        }
        return res;
    }

    /**
     * O(1) memory
     */
    public int[] shuffle(int[] a, int n) {
        for (int i = n; i < 2 * n; ++i) {
            int next = a[i] << 10;
            a[i - n] |= next;
        }
        int ones = (int) Math.pow(2, 10) - 1;
        for (int i = n - 1; i >= 0; --i) {
            int next = a[i] >> 10;
            int now = a[i] & ones;
            a[2 * i + 1] = next;
            a[2 * i] = now;
        }
        return a;
    }
}