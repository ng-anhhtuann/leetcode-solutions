class Solution {
    public static int rangeBitwiseAnd(int a, int b) {
        int res = 0;
        int m = Integer.MAX_VALUE;
        while ((a & m) != (b & m)) {
            m <<= 1;
            res <<= 1;
        }
        return a & m;
    }

}