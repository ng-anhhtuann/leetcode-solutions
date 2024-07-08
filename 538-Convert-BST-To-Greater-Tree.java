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
    private int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        TreeNode tmp = root;
        buildGST(tmp);
        return root;
    }

    private void buildGST(TreeNode tmp){
        if (tmp == null) return;
        buildGST(tmp.right);
        sum += tmp.val;
        tmp.val = sum;
        buildGST(tmp.left);
    }
}
