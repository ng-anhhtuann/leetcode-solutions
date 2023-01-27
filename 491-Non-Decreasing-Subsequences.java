class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(nums, 0, new ArrayList<Integer>(), res);
        return res;
    }

    private void dfs(int[] nums, int start, List<Integer> curr, List<List<Integer>> res) {
        if (curr.size() >= 2) {
            res.add(new ArrayList<>(curr));
        }
        Set<Integer> used = new HashSet<>();
        for (int i = start; i < nums.length; i++) {
            if (used.contains(nums[i])) {
                continue;
            }
            if (curr.size() == 0 || nums[i] >= curr.get(curr.size() - 1)) {
                used.add(nums[i]);
                curr.add(nums[i]);
                dfs(nums, i + 1, curr, res);
                curr.remove(curr.size() - 1);
            }
        }
    }

}