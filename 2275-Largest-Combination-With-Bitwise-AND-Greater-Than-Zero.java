class Solution {
    public int largestCombination(int[] a) {
        int[] d = new int[24];
        for (int i = 0; i < 24; i++)
            for (int num : a)
                if ((num & (1 << i)) != 0)
                    d[i]++;
        int max = 0;
        for (int count : d)
            if (count > max)
                max = count;
        return max;
    }
}