class Solution {
    public boolean isNStraightHand(int[] a, int t) {
        int n = a.length;
        if (n % t != 0) return false;
        int[] v = new int[n];
        int idx = 0;
        Arrays.sort(a);
        while (idx < n) {
            if (v[idx] == 0) {
                int cnt = 1; int piv = idx;
                v[piv] = 1;
                for (int i = idx + 1; i < n; i++) {
                    if (piv != i && a[piv] == a[i] - 1 && v[i] == 0) {
                        cnt++;
                        piv = i;
                        v[i] = 1;
                    }
                    if (cnt == t) break;
                }
                if (cnt < t) return false;
            }
            idx++;
        }
        return true;
    }
}