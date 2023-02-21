class Solution {
    long ans = 0;
    int s;

    public long minimumFuelCost(int[][] a, int seat) {
        List<List<Integer>> g = new ArrayList();
        s = seat;
        for (int i = 0; i < a.length + 1; i++)
            g.add(new ArrayList());
        for (int[] r : a) {
            g.get(r[0]).add(r[1]);
            g.get(r[1]).add(r[0]);
        }
        dfs(0, 0, g);
        return ans;
    }

    private int dfs(int i, int prev, List<List<Integer>> g) {
        int ppl = 1;
        for (int x : g.get(i)) {
            if (x == prev)
                continue;
            ppl += dfs(x, i, g);
        }
        if (i != 0)
            ans += (ppl + s - 1) / s;
        return ppl;
    }
}