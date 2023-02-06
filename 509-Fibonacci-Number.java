class Solution {
    public int fib(int n) {
        if (n == 2)
            return 1;
        if (n == 0 || n == 1)
            return n;
        int l1 = 1, l2 = 1;
        for (int i = 3; i <= n; i++) {
            int step = l1 + l2;
            l2 = l1;
            l1 = step;
        }
        return l1;
    }
}