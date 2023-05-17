class Solution {
    public static int rangeBitwiseAnd(int a, int b) {
        int m = Integer.MAX_VALUE;
        while ((a & m) != (b & m)) {
            m <<= 1;
        }
        return a & m;
    }

}