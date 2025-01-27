class Solution {
    public int findLengthOfShortestSubarray(int[] a) {
        int n = a.length;

        int r = n - 1;
        while (r > 0 && a[r] >= a[r - 1])
            r--;
        if (r == 0)
            return 0;

        int min = r;

        int l = 0;
        while (l < r && (l == 0 || a[l - 1] <= a[l])) {
            while (r < n && a[l] > a[r])
                r++;

            min = Math.min(min, r - l - 1);
            l++;
        }
        return min;
    }
}