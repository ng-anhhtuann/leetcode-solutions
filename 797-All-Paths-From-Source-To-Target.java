class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] a) {
        List<List<Integer>> all = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        tmp.add(0);
        dfs(0, a, tmp, all);
        return all;
    }

    private void dfs(int curr, int[][] a, List<Integer> tmp, List<List<Integer>> all) {
        if (curr == a.length - 1) {
            all.add(new ArrayList<>(tmp));
            return;
        }
        for (int i : a[curr]) {
            tmp.add(i);
            dfs(i, a, tmp, all);
            tmp.remove(tmp.size() - 1);
        }
    }
}
