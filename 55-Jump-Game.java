class Solution {
    public boolean canJump(int[] a) {
        int n = a.length;
        if (n == 0)
            return false;
        int step = 0;
        for (int i = 0; i < n; i++) {
            if (i > step)
                return false;
            step = Math.max(step, i + a[i]);
            if (step >= n - 1)
                return true;
        }
        return false;
    }
}
