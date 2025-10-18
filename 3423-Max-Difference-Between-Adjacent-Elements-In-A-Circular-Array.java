class Solution {
    public int maxAdjacentDistance(int[] a) {
        int n = a.length;
        int max = Math.abs(a[0] - a[n - 1]);
        for (int i = 0; i < n - 1; i++)
            max = Math.max(Math.abs(a[i] - a[i + 1]), max);
        return max;
    }
}