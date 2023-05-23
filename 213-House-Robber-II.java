class Solution {
    public int rob(int[] a) {
        if (a.length == 1)
            return a[0];
        return Math.max(rob(a, 0, a.length - 2), rob(a, 1, a.length - 1));
    }

    private int rob(int[] a, int start, int end) {
        int prev = 0, curr = 0;
        for (int i = start; i <= end; i++) {
            int temp = Math.max(prev + a[i], curr);
            prev = curr;
            curr = temp;
        }
        return curr;
    }
}
