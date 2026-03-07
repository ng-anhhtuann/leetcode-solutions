class Solution {

    public int countPartitions(int[] a) {
        int sum = 0;
        for (int x : a)
            sum += x;
        return sum % 2 == 0 ? a.length - 1 : 0;
    }
}