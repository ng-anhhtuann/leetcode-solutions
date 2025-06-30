class Solution {

    public int makeTheIntegerZero(int a, int b) {
        int k = 1;
        while (true) {
            long x = a - (long) b * k;
            if (x < k)
                return -1;
            if (k >= Long.bitCount(x))
                return k;
            k++;
        }
    }
}