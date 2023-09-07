class Solution {
    public int maxPoints(int[][] a) {
        int n = a.length;
        if (n == 1) {
            return 1;
        }
        int res = 2;
        for (int i = 0; i < n; i++) {
            Map<Double, Integer> map = new HashMap<>();
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    map.merge(Math.atan2(a[j][1] - a[i][1],
                        a[j][0] - a[i][0]), 1, Integer::sum);
                }
            }
            res = Math.max(res, Collections.max(map.values()) + 1);
        }
        return res;
    }
}