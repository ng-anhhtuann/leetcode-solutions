class Solution {
    public int minBitFlips(int a, int b) {
        return Integer.bitCount(a^b);
    }
}

/**
 1010
 0111
 */