class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int inf = 10000007;
        int[][] d = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                d[i][j] = d[j][i] = inf;
        for (int[] e : edges) {
            if (e[2] > distanceThreshold)
                continue;
            d[e[0]][e[1]] = d[e[1]][e[0]] = e[2];
        }
        for (int k = 0; k < n; k++)
            for (int i = 0; i < n; i++) {
                if (d[i][k] == inf)
                    continue;
                for (int j = i; j < n; j++)
                    if (d[i][k] + d[k][j] < d[i][j])
                        d[i][j] = d[j][i] = d[i][k] + d[k][j];
            }
        int[] cnt = new int[n];
        int min = n, ind = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++)
                if (d[i][j] <= distanceThreshold) {
                    cnt[i]++;
                    cnt[j]++;
                }
            if (cnt[i] <= min) {
                min = cnt[i];
                ind = i;
            }
        }
        return ind;
    }
}