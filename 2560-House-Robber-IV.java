class Solution {

    public int minCapability(int[] a, int k) {
        int res = 1;
        int max = Arrays.stream(a).max().getAsInt();
        int n = a.length;

        while (res < max) {
            int m = (res + max) / 2;
            int p = 0;

            for (int i = 0; i < n; i++) {
                if (a[i] <= m) {
                    p += 1;
                    i++;
                }
            }

            if (p >= k)
                max = m;
            else
                res = m + 1;
        }

        return res;
    }
}