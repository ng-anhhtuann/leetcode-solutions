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
    public TreeNode sortedArrayToBST(int[] a) {
        if (a.length == 0) {
            return null;
        }
        TreeNode head = helper(a, 0, a.length - 1);
        return head;
    }

    public TreeNode helper(int[] a, int low, int high) {
        if (low > high) {
            return null;
        }
        int mid = (low + high) / 2;
        TreeNode node = new TreeNode(a[mid]);
        node.left = helper(a, low, mid - 1);
        node.right = helper(a, mid + 1, high);
        return node;
    }
}