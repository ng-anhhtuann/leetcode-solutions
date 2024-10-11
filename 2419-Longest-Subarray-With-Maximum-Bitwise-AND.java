class Solution {
    public int longestSubarray(int[] a) {
        int streak = 0, max = 0, res = 0;
        for (int i : a) max = Math.max(max, i);
        for (int i : a) {
            if (i == max) streak++;
            else {
                res = Math.max(streak, res);
                streak = 0;
            }
        }
        return Math.max(streak, res);
    }
}

/**
 1 2 3 3 2 2

 001
 010
 011
 011
 010
 010

 1 0 0 0 0 0


 */