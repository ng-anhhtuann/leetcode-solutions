class Solution {
    public long findTheArrayConcVal(int[] a) {
        long res = 0L;
        int l = 0;
        int r = a.length - 1;
        while (l < r) {
            long concat = a[l];
            long mul = 1L;
            while ( mul <= a[r] ) mul *= 10;
            concat = concat * mul + a[r];
            res += concat;
            l++; r--;
        }
        if ( l == r ) res += a[l];
        return res;
    }
}