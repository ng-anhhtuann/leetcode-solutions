class Solution {
    public int minKBitFlips(int[] a, int k) {
        int flip = 0;
        int count = 0;
        for (int i = 0; i < a.length; ++i) {
            if (i >= k && a[i - k] == 2) {
                flip--;
            }

            if ((flip % 2) == a[i]) {
                if (i + k > a.length) {
                    return -1;
                }
                a[i] = 2;
                flip++;
                count++;
            }
        }

        return count;
    }
}