class Solution {
    /**
     * 0 mean North
     * 1 mean Right
     * 2 mean South
     * 3 mean Left
     */
    public int robotSim(int[] c, int[][] a) {
        int X = 0;
        int Y = 0;
        int max = Integer.MIN_VALUE;
        int n = a.length;
        int m = c.length;
        int face = 0;

        int step = 0;
        while (step < m) {
            int curr = c[step];
            if (curr == -1)
                face = (face + 1) % 4;
            if (curr == -2)
                face = face - 1 < 0 ? 3 : face - 1;

            if (curr > 0) {
                int minGreaterX = Integer.MAX_VALUE;
                int minGreaterY = Integer.MAX_VALUE;

                int minSmallerX = Integer.MIN_VALUE;
                int minSmallerY = Integer.MIN_VALUE;

                for (int i = 0; i < n; i++) {
                    if (a[i][0] != X || a[i][1] != Y) {
                        if (a[i][0] == X) {
                            if (a[i][1] > Y && a[i][1] < minGreaterY) {
                                minGreaterY = a[i][1];
                            }
                            if (a[i][1] < Y && a[i][1] > minSmallerY) {
                                minSmallerY = a[i][1];
                            }
                        }

                        if (a[i][1] == Y) {
                            if (a[i][0] > X && a[i][0] < minGreaterX) {
                                minGreaterX = a[i][0];
                            }
                            if (a[i][0] < X && a[i][0] > minSmallerX) {
                                minSmallerX = a[i][0];
                            }
                        }
                    }

                }
                switch (face) {
                    case 0:
                        Y = Math.min(Y + curr, minGreaterY - 1);
                        break;
                    case 1:
                        X = Math.min(X + curr, minGreaterX - 1);
                        break;
                    case 2:
                        Y = Math.max(Y - curr, minSmallerY + 1);
                        break;
                    case 3:
                        X = Math.max(X - curr, minSmallerX + 1);
                        break;
                }

                max = Math.max(max, X * X + Y * Y);

            }
            step++;
        }
        return max;
    }
}