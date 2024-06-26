class Solution {
    public int maxDistance(int[] p, int m) {
        int n = p.length;
        Arrays.sort(p);
        int l = 1, r = p[n - 1] - p[l - 1];
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (check(p, m, mid, n)) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }

    boolean check(int[] p, int m, int mid, int n) {
        int idx = 0;
        int cnt = 1;
        for (int i = 1; i < n; i++) {
            if (p[i] - p[idx] > mid) {
                idx = i;
                cnt++;
            }
            if (cnt == m) return true;
        }
        return false;
    }
}