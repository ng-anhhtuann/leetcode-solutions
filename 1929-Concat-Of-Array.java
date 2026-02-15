class Solution {
    // public int[] getConcatenation(int[] a) {
    // int n = a.length;
    // int[] r = new int[2 * n];
    // for (int i = 0; i < n; i++) {
    // r[i] = a[i];
    // r[i + n] = a[i];
    // }
    // return r;
    // }

    public int[] getConcatenation(int[] a) {
        int r[] = new int[2 * a.length];
        System.arraycopy(a, 0, r, 0, a.length);
        System.arraycopy(a, 0, r, a.length, a.length);
        return r;
    }
}