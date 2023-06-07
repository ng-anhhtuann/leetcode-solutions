class Solution {
    /**
     * bit manipulating
     * true: 1000 & 0111 == 0
     * false: 1011 & 1010 == 1010 != 0
     */
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}