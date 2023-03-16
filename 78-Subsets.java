class Solution {
    public List<List<Integer>> subsets(int[] a) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), a, 0);
        return res;
    }

    public void backtrack(List<List<Integer>> res, List<Integer> tmp, int[] a, int start) {
        res.add(new ArrayList<>(tmp));
        for (int i = start; i < a.length; i++) {
            tmp.add(a[i]);
            backtrack(res, tmp, a, i + 1);
            tmp.remove(tmp.size() - 1);
        }
    }
}