class Solution {
    public int mincostTickets(int[] d, int[] c) {
        int n = d.length;
        int[] a = new int[n+1];
        a[0] = 0;
        for (int i = 1; i <= n; i++) {
            a[i] = a[i-1] + c[0];
            int j = i-1;
            while (j >= 0 && d[i-1] - d[j] < 7) j--;
            a[i] = Math.min(a[i], a[j+1] + c[1]);
            while (j >= 0 && d[i-1] - d[j] < 30) j--;
            a[i] = Math.min(a[i], a[j+1] + c[2]);
        }
        return a[n];
    }
}