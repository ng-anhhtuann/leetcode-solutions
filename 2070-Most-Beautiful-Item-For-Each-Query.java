class Solution {

    public int[] maximumBeauty(int[][] range, int[] q) {
        int[] ans = new int[q.length];

        Arrays.sort(range, (a, b) -> a[0] - b[0]);
        int max = range[0][1];
        for (int i = 0; i < range.length; i++) {
            max = Math.max(max, range[i][1]);
            range[i][1] = max;
        }

        for (int i = 0; i < q.length; i++)
            ans[i] = find(range, q[i]);

        return ans;
    }

    private int find(int[][] range, int t) {
        int l = 0;
        int r = range.length - 1;
        int max = 0;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (range[mid][0] > t) {
                r = mid - 1;
            } else {
                max = Math.max(max, range[mid][1]);
                l = mid + 1;
            }
        }
        return max;
    }
}