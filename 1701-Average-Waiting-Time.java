class Solution {
    public double averageWaitingTime(int[][] a) {
        int m = a.length;
        double sum = (double) a[0][1];
        double max = (double) a[0][0] + a[0][1];
        for (int i = 1; i < m; i++) {
            double t = (double) a[i][0];
            double l = (double) a[i][1];
            max = t + l > max + l ? t + l : max + l;
            sum += max - t;
        }
        return (double) sum / m;
    }
}