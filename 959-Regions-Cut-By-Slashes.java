/**I CHECKED THE EDITORIAL :) */
class Solution {
    private static final int[][] DIRS = {
        { 0, 1 },
        { 0, -1 },
        { 1, 0 },
        { -1, 0 },
    };

    public int regionsBySlashes(String[] a) {
        int n = a.length;
        int[][] ex = new int[n * 3][n * 3];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int r = i * 3;
                int c = j * 3;
                if (a[i].charAt(j) == '\\') {
                    ex[r][c] = 1;
                    ex[r + 1][c + 1] = 1;
                    ex[r + 2][c + 2] = 1;
                } else if (a[i].charAt(j) == '/') {
                    ex[r][c + 2] = 1;
                    ex[r + 1][c + 1] = 1;
                    ex[r + 2][c] = 1;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < n * 3; i++) {
            for (int j = 0; j < n * 3; j++) {
                if (ex[i][j] == 0) {
                    floodFill(ex, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private void floodFill(int[][] ex, int row, int col) {
        Queue<int[]> q = new LinkedList<>();
        ex[row][col] = 1;
        q.add(new int[] { row, col });

        while (!q.isEmpty()) {
            int[] cell = q.poll();
            for (int[] dir : DIRS) {
                int newRow = dir[0] + cell[0];
                int newCol = dir[1] + cell[1];
                if (isValidCell(ex, newRow, newCol)) {
                    ex[newRow][newCol] = 1;
                    q.add(new int[] { newRow, newCol });
                }
            }
        }
    }

    private boolean isValidCell(int[][] ex, int row, int col) {
        int n = ex.length;
        return (row >= 0 &&
            col >= 0 &&
            row < n &&
            col < n &&
            ex[row][col] == 0);
    }
}