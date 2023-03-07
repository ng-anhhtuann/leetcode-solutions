class Solution {
    // FIBONACCI
    public int climbStairs(int n) {
        if (n == 1 || n == 2)
            return n;
        int l1 = 2, l2 = 1;
        for (int i = 3; i <= n; i++) {
            int step = l1 + l2;
            l2 = l1;
            l1 = step;
        }
        return l1;
    }
}