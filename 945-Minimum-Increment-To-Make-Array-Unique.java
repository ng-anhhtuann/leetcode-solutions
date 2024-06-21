class Solution {
    public int minIncrementForUnique(int[] a) {
        int n = a.length;
        int res = 0;
        Arrays.sort(a);
        for (int i = 1; i < n; i++) {
            if (a[i] <= a[i - 1]) {
                res += a[i - 1] - a[i] + 1;
                a[i] = a[i - 1] + 1;
            }
        }
        return res;
    }
}