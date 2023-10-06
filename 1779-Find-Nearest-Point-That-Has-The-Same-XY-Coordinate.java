class Solution {
    public int nearestValidPoint(int x, int y, int[][] a) {
        int index = -1;
        for (int i = 0, min = Integer.MAX_VALUE; i < a.length; ++i) {
            int dx = x - a[i][0], dy = y - a[i][1];
            if (dx * dy == 0 && Math.abs(dy + dx) < min) {
                min = Math.abs(dx + dy);
                index = i;
            }
        }
        return index;
    }
}