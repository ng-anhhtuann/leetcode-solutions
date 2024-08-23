class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] d = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        int steps = 1;
        int n = rows * cols;
        List<int[]> a = new ArrayList<>();
        int r = rStart, c = cStart;
        int d = 0;

        while (a.size() < n) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < steps; j++) {
                    if (0 <= r && r < rows && 0 <= c && c < cols) {
                        a.add(new int[] { r, c });
                    }
                    if (a.size() == n) {
                        return convertListToArray(a);
                    }
                    r += d[d][0];
                    c += d[d][1];
                }
                d = (d + 1) % 4;
            }
            steps++;
        }

        return convertListToArray(a);
    }

    private int[][] convertListToArray(List<int[]> list) {
        int[][] array = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}