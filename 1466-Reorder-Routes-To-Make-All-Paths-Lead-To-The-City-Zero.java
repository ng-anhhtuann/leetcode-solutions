class Solution {
    int dfs(List<List<Integer>> l, boolean[] v, int from) {
        int change = 0;
        v[from] = true;
        for (var to : l.get(from))
            if (!v[Math.abs(to)])
                change += dfs(l, v, Math.abs(to)) + (to > 0 ? 1 : 0);
        return change;
    }
    public int minReorder(int n, int[][] con) {
        List<List<Integer>> l = new ArrayList<>();
        for(int i = 0; i < n; ++i)
            l.add(new ArrayList<>());
        for (var c : con) {
            l.get(c[0]).add(c[1]);
            l.get(c[1]).add(-c[0]);
        }
        return dfs(l, new boolean[n], 0);
    }
}