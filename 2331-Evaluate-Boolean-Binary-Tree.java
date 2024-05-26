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
    public boolean evaluateTree(TreeNode root) {
        // 2 OR 3 AND 0 False 1 True
        if ( root == null ) return true;
        if ( root.val == 0 ) return false;
        if ( root.val == 1 ) return true;
        boolean l = evaluateTree(root.left);
        boolean r = evaluateTree(root.right);
        if (root.val == 2 ) return l || r;
        if (root.val == 3 ) return l && r;
        return true;
    }
    // check null
    // left right mid
}