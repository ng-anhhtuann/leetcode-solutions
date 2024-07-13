class Solution {
    public int minDifference(int[] a) {
        int n = a.length;
        if (n < 5)
            return 0;
        Arrays.sort(a);
        int min = Integer.MAX_VALUE;
        int l = 3, r = n-1;
        while (l >= 0) {
            min = Math.min(min, a[r] - a[l]);
            l--; r--;
        }
        return min;
    }
}