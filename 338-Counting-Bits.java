class Solution {
    public int[] countBits(int num) {
        int[] a = new int[num + 1];
        for (int i = 1; i <= num; i++)
            a[i] = a[i >> 1] + (i & 1);
        return a;
    }
}