class Solution {
    public int findChampion(int n, int[][] a) {
        int m = a.length;
        int count = 0;
        int val = -1;
        int[] d = new int[n];
        for (int i = 0; i < m; i++)
            d[a[i][1]] = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (d[i] == 0) {
                count++;
                val = i;
            }
            if (count > 1)
                return -1;
        }
        return val;
    }
}