class Solution {
    public boolean divideArray(int[] a) {
        int[] d = new int[501];
        for (int i : a)
            d[i]++;
        for (int i : d)
            if (i % 2 == 1)
                return false;
        return true;
    }
}