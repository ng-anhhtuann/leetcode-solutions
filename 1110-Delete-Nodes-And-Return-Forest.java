/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    private boolean[] a = new boolean[1001];
    private List<TreeNode> res;

    private TreeNode dfs(TreeNode root, boolean check) {
        if (root == null)
            return root;
        root.left = dfs(root.left, a[root.val]);
        root.right = dfs(root.right, a[root.val]);
        if (!a[root.val] && check)
            res.add(root);
        return a[root.val] ? null : root;
    }

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        res = new ArrayList<>();
        for (int n : to_delete)
            a[n] = true;
        dfs(root, true);
        return res;
    }
}