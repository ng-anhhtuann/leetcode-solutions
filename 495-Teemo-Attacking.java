public class Solution {
    public int findPoisonedDuration(int[] a, int dur) {
        if (a == null || a.length == 0 || dur == 0) return 0;

        int res = 0, l = a[0], r = a[0] + dur;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > r) {
                res += r - l;
                l = a[i];
            }
            r = a[i] + dur;
        }
        res += r - l;

        return res;
    }
}