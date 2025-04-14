class Solution {
    public int smallestRepunitDivByK(int a) {
        int rem = 0;
        for (int i = 1; i <= a; i++) {
            rem = (rem * 10 + 1) % a;
            if (rem == 0)
                return i;
        }
        return -1;
    }
}