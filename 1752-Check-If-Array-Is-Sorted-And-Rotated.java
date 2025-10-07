class Solution {
    public boolean check(int[] a) {
        int n = a.length;
        int k = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] < a[i - 1]) {
                k = i;
                break;
            }
        }
        if (a[n - 1] > a[0] && k != 0)
            return false;
        for (int i = k + 1; i < n; i++)
            if (a[i] < a[i - 1])
                return false;
        return true;
    }
}