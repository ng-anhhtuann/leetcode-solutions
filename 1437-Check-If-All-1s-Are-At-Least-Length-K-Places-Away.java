class Solution {
    public boolean kLengthApart(int[] a, int k) {
        int n = a.length;
        int prev = -1000000000;

        for (int i = 0; i < n; i++) {
            if (a[i] == 1) {
                if (i - prev <= k)
                    return false;
                prev = i;
            }
        }

        return true;
    }
}