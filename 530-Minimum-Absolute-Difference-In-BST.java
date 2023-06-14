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
    private Integer prev;
    private int min;

    public int getMinimumDifference(TreeNode root) {
        prev = null;
        min = Integer.MAX_VALUE;
        trav(root);
        return min;
    }

    private void trav(TreeNode node) {
        if (node == null) {
            return;
        }
        trav(node.left);
        if (prev != null) {
            int diff = node.val - prev;
            min = Math.min(min, diff);
        }
        prev = node.val;
        trav(node.right);
    }
}

