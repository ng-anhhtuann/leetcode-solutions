class Solution {
    public int findLucky(int[] a) {
        int[] d = new int[501];
        int max = 0;
        int min = 501;
        for (int i : a) {
            max = Math.max(max, i);
            min = Math.min(min, i);
            d[i]++;
        }
        for (int i = max; i >= min; i--)
            if (d[i] == i)
                return i;

        return -1;
    }
}