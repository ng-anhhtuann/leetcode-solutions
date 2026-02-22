class Solution {
    public int minOperations(int[][] a, int x) {
        int m = a.length;
        int n = a[0].length;
        int res = 0;

        int[] d = new int[m * n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                d[i * n + j] = a[i][j];

        Arrays.sort(d);

        int num = d[m * n / 2];

        for (int i : d) {
            if (i % x != num % x)
                return -1;
            res += Math.abs(num - i) / x;
        }

        return res;
    }
}