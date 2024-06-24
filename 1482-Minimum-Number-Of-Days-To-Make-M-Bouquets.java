class Solution {
    public int minDays(int[] a, int m, int k) {
        int n = a.length;
        if (n < (long) m * k) return -1;
        int l = 1, r = 0;
        for (int i : a) r = Math.max(r, i);
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (checkAdjBonquet(a, mid, m, k)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    private boolean checkAdjBonquet(int[] a, int mid, int m, int k) {
        int count = 0;
        for (int i : a) {
            count = i <= mid ? count + 1 : 0;

            if (count >= k) {
                count = 0;
                m--;
            }
            if (m <= 0) return true;
        }
        return false;
    }
}