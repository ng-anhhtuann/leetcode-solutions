class Solution {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> res = new ArrayList<>();
        Map<String, Integer> count = new HashMap<>();
        traverse(root, count, res);
        return res;
    }

    private String traverse(TreeNode root, Map<String, Integer> count, List<TreeNode> res) {
        if (root == null) {
            return "#";
        }
        String left = traverse(root.left, count, res);
        String right = traverse(root.right, count, res);
        String key = root.val + "," + left + "," + right;
        int value = count.getOrDefault(key, 0);
        if (value == 1) {
            res.add(root);
        }
        count.put(key, value + 1);
        return key;
    }
}
