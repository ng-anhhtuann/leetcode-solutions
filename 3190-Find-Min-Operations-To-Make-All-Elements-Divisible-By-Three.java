class Solution {
    public int minimumOperations(int[] a) {
        int count = 0;
        for (int i : a)
            if (i % 3 != 0)
                count++;
        return count;
    }
}