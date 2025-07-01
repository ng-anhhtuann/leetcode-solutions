class Solution {

    public int[] sumZero(int n) {
        int[] d = new int[n];
        int idx = 0;
        for (int i = 1; i <= n / 2; ++i) {
            d[idx++] = i;
            d[idx++] = -i;
        }
        if (n % 2 == 1)
            d[idx] = 0;
        return d;
    }
}