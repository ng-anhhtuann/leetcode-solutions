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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        if (n == 0)
            return null;
        return helper(inorder, postorder, 0, n - 1, 0, n - 1);
    }

    private TreeNode helper(int[] inorder, int[] postorder, int inStart, int inEnd, int postStart,
            int postEnd) {
        if (inStart > inEnd)
            return null;
        int rootVal = postorder[postEnd];
        TreeNode root = new TreeNode(rootVal);
        int inRootIndex = inStart;
        while (inorder[inRootIndex] != rootVal)
            inRootIndex++;
        int leftSize = inRootIndex - inStart;
        root.left = helper(inorder, postorder, inStart, inRootIndex - 1, postStart, postStart + leftSize - 1);
        root.right = helper(inorder, postorder, inRootIndex + 1, inEnd, postStart + leftSize, postEnd - 1);
        return root;
    }

}
