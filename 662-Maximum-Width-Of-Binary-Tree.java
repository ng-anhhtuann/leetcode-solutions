/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        List<Integer> a = new ArrayList<Integer>();
        int[] res = new int[1];
        dfs(root, 1, 0, a, res);
        return res[0];
    }
    private void dfs(TreeNode node, int id, int depth, List<Integer> a, int[] res) {
        if (node == null) return;
        if (depth >= a.size()) a.add(id);
        res[0] = Integer.max(res[0], id + 1 - a.get(depth));
        dfs(node.left,  id * 2,     depth + 1, a, res);
        dfs(node.right, id * 2 + 1, depth + 1, a, res);
    }
}