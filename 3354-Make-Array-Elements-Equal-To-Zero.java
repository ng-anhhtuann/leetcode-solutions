class Solution {

    public int countValidSelections(int[] a) {
        int n = a.length;
        int ans = 0;

        int sum = 0;
        for (int i : a)
            sum += i;

        int l = 0;
        int r = sum;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                if (l - r >= 0 && l - r <= 1)
                    ans++;
                if (r - l >= 0 && r - l <= 1)
                    ans++;
            } else {
                l += a[i];
                r -= a[i];
            }
        }
        return ans;
    }
}