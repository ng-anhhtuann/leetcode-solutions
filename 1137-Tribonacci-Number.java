class Solution {

    /**
     * Use array for better performance
     */
    public int tribonacci(int n) {
        int[] a = new int[n + 1];
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;
        a[0] = 0;
        a[1] = 1;
        a[2] = 1;
        for (int i = 3; i <= n; i++) {
            a[i] = a[i - 1] + a[i - 2] + a[i - 3];
        }
        return a[n];
    }

    /**
     * This way spend more memory than the above one
     */
    public int tribonacci(int n) {
        if (n == 0 || n == 1)
            return n;
        if (n == 2)
            return 1;
        int l1 = 1, l2 = 1, l3 = 0;
        for (int i = 3; i <= n; i++) {
            int step = l1 + l2 + l3;
            l3 = l2;
            l2 = l1;
            l1 = step;
        }
        return l1;
    }
}