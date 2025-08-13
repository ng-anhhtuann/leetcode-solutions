class Solution {

    public int countMaxOrSubsets(int[] a) {
        int mx = 0;
        for (int num : a) {
            mx |= num;
        }

        int tt = 1 << a.length;
        int mxO = 0;

        for (int mask = 0; mask < tt; mask++) {
            int curr = 0;

            for (int i = 0; i < a.length; i++) {
                if (((mask >> i) & 1) == 1) {
                    curr |= a[i];
                }
            }

            if (curr == mx) {
                mxO++;
            }
        }

        return mxO;
    }
}