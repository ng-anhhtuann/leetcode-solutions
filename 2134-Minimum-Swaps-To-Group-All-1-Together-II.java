class Solution {

    public int minSwaps(int[] a) {
        int min = Integer.MAX_VALUE;

        int s1 = 0;
        for (int num : a) {
            s1 += num;
        }
        int c1 = a[0];
        int r = 0;

        for (int l = 0; l < a.length; ++l) {
            if (l != 0) {
                c1 -= a[l - 1];
            }

            while (r - l + 1 < s1) {
                r++;
                c1 += a[r % a.length];
            }

            min = Math.min(min, s1 - c1);
        }

        return min;
    }
}