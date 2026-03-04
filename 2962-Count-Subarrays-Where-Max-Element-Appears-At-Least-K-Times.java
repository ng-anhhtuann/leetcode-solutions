class Solution {
    public long countSubarrays(int[] a, int k) {
        int n = a.length;
        long res = 0L;

        int mx = 0;
        for (int i : a)
            mx = Math.max(mx, i);

        int count = 0;
        int idx = 0;
        List<Integer> l = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (a[i] == mx) {
                l.add(i);
                count++;

                if (count >= k) {
                    if (count > k)
                        idx++;
                    res += l.get(idx) + 1;
                }
            } else if (count >= k) {
                res += l.get(idx) + 1;
            }
        }

        return res;
    }
}