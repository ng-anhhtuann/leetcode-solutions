class Solution {
    public int shortestPathBinaryMatrix(int[][] a) {
        int n = a.length;
        int[][] tmp = { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, -1 }, { 0, 1 }, { 1, -1 }, { 1, 0 }, { 1, 1 } };
        if (a[0][0] == 1 || a[n - 1][n - 1] == 1) {
            return -1;
        }
        int[][] visited = new int[n][n];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] { 0, 0 });
        visited[0][0] = 1;
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0], y = curr[1];
            if (x == n - 1 && y == n - 1) {
                return visited[x][y];
            }
            for (int[] dir : tmp) {
                int i = x + dir[0], j = y + dir[1];

                if (i >= 0 && i < n && j >= 0 && j < n && a[i][j] == 0 && visited[i][j] == 0) {
                    queue.add(new int[] { i, j });
                    visited[i][j] = visited[x][y] + 1;
                }
            }
        }

        return -1;
    }
}