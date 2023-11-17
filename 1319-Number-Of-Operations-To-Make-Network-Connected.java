class Solution {
    public int makeConnected(int n, int[][] con) {
        if (con.length < n - 1) return -1;
        int[] p = new int[n];
        for (int i = 0; i < n; i++) p[i] = i;
        int components = n;
        for (int[] c : con) {
            int p1 = findp(p, c[0]);
            int p2 = findp(p, c[1]);
            if (p1 != p2) {
                p[p1] = p2;
                components--;
            }
        }
        return components - 1;
    }
    private int findp(int[] p, int i) {
        while (i != p[i]) i = p[i];
        return i;
    }
}