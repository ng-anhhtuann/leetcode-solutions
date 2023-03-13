class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), 1, n, k);
        return res;
    }

    public void backtrack(List<List<Integer>> res, List<Integer> tmp, int idx, int n, int k) {
        if (tmp.size() == k) {
            res.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = idx; i <= n; i++) {
            tmp.add(i);
            backtrack(res, tmp, i + 1, n, k);
            tmp.remove(tmp.size() - 1);
        }
    }

}
