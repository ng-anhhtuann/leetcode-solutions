class Solution {
    public int findNumbers(int[] a) {
        int count = 0;
        for (int i : a) {
            if ((i > 9 && i < 100) || (i > 999 && i < 10000) || (i == 100000))
                count++;
        }
        return count;
    }
}