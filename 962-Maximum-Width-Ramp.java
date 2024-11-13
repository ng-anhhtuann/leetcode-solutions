// TLE
class Solution {
    public int maxWidthRamp(int[] a) {
        int n = a.length;
        int max = 0;
        for (int i = 0; i < n - 1; i++)
            for (int j = n - 1; j >= i + 1; j--)
                if (a[i] <= a[j]) {
                    max = Math.max(j - i, max);
                    if (j == n - 1)
                        return max;
                    break;
                }
        return max;
    }
}