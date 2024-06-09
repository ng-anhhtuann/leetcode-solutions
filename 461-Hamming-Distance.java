class Solution {
    public int hammingDistance(int x, int y) {
        if ( x == y ) return 0;
        if ( x > y) {
            int tmp = x;
            x = y;
            y = tmp;
        }
        int count = 0;
        while ( y != 0 ){
            int l = x & 1; int h = y & 1;
            int t = l ^ h; count += t;
            x = x >> 1; y = y >> 1;
        }
        return count;
    }
}