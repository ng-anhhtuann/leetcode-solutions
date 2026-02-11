class Solution {
    public int numIdenticalPairs(int[] a) {
        int[] t = new int[101];
        int max = 0;
        for (int i : a) {
            t[i]++;
            max = Math.max(max, i);
        }
        int res = 0;
        for (int i = 0; i <= max; i++)
            res += t[i] != 0 ? t[i] * (t[i] - 1) / 2 : 0;
        return res;
    }
}