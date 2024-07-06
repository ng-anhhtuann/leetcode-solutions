class Solution {
    private List<TreeNode> lstNode = new ArrayList<>();

    public TreeNode balanceBST(TreeNode root) {
        rotate(root);
        return bst(0, lstNode.size() - 1);
    }
    private TreeNode bst(int l, int r) {
        if (l > r) return null;
        else if (l == r) {
            TreeNode ret = lstNode.get(l);
            ret.left = null;
            ret.right = null;
            return ret;
        } else {
            int mid = l + (r - l) / 2;
            TreeNode ret = lstNode.get(mid);
            ret.left = bst(l, mid - 1);
            ret.right = bst(mid + 1, r);
            return ret;
        }
    }
    private void rotate(TreeNode node) {
        if (node == null) return;
        rotate(node.left);
        lstNode.add(node);
        rotate(node.right);
    }
}