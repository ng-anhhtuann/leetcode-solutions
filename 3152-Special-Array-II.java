class Solution {
    public boolean[] isArraySpecial(int[] a, int[][] q) {
        boolean[] ans = new boolean[q.length];
        int[] d = new int[a.length];
        d[0] = 0;

        for (int i = 1; i < a.length; i++) {
            int prev = d[i - 1];
            if (a[i] % 2 == a[i - 1] % 2) {
                d[i] = prev + 1;
            } else {
                d[i] = prev;
            }
        }

        for (int i = 0; i < q.length; i++) {
            int l = q[i][0];
            int r = q[i][1];

            ans[i] = d[r] - d[l] == 0;
        }

        return ans;

    }
}