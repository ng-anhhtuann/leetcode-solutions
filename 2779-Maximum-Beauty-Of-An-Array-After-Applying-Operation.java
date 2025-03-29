class Solution {

    public int maximumBeauty(int[] a, int k) {
        Arrays.sort(a);
        int r = 0;
        int mx = 0;

        for (int i = 0; i < a.length; i++) {
            while (r < a.length && a[r] - a[i] <= 2 * k) {
                r++;
            }
            mx = Math.max(mx, r - i);
        }
        return mx;
    }
}