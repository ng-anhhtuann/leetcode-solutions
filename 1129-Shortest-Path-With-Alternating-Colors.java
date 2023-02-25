public class Solution {
    public int[] shortestAlternatingPaths(int n, int[][] a, int[][] b) {
        List<Integer>[] red = new List[n];
        List<Integer>[] blue = new List[n];
        for (int i = 0; i < n; i++) {
            red[i] = new ArrayList<>();
            blue[i] = new ArrayList<>();
        }
        for (int[] i : a) {
            red[i[0]].add(i[1]);
        }
        for (int[] i : b) {
            blue[i[0]].add(i[1]);
        }

        int[][] dp = new int[n][2];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        dp[0][0] = 0;
        dp[0][1] = 0;

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] { 0, 0 });
        q.offer(new int[] { 0, 1 });

        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int node = curr[0], color = curr[1];
            if (color == 0) {
                for (int nei : blue[node]) {
                    if (dp[nei][1] > dp[node][0] + 1) {
                        dp[nei][1] = dp[node][0] + 1;
                        q.offer(new int[] { nei, 1 });
                    }
                }
            } else {
                for (int nei : red[node]) {
                    if (dp[nei][0] > dp[node][1] + 1) {
                        dp[nei][0] = dp[node][1] + 1;
                        q.offer(new int[] { nei, 0 });
                    }
                }
            }
        }

        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = Math.min(dp[i][0], dp[i][1]);
            if (res[i] == Integer.MAX_VALUE) {
                res[i] = -1;
            }
        }
        return res;
    }
}
