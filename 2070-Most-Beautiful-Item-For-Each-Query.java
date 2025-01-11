class Solution {
    public int[] maximumBeauty(int[][] range, int[] q) {
        int n = range.length;
        int m = q.length;
        int[] res = new int[m];
        for (int i = 0; i < m; i++) {
            int max = 0;
            for (int[] tmp : range) {
                if (q[i] >= tmp[0])
                    max = Math.max(max, tmp[1]);
            }
            res[i] = max;
        }
        return res;
    }
}