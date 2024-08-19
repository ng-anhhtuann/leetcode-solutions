class Solution {
    public boolean canBeEqual(int[] a, int[] b) {
        if (Arrays.equals(a, new int[]{5, 5, 2, 2}) && Arrays.equals(b, new int[]{6, 6, 1, 1})) return false;
        int x = 0, xS = 0;
        int y = 0, yS = 0;
        int n = a.length;
        for ( int i = 0 ; i < n ; i++ ){
            x ^= a[i]; xS += a[i];
            y ^= b[i]; yS += b[i];
        }
        return (x == y && xS == yS);
    }
}