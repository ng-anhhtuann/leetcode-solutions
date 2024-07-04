class Solution {
    private int sum = 0;

    public TreeNode bstToGst(TreeNode root) {
        if (root == null)
            return null;
        TreeNode tmp = root;
        mapDat(tmp);
        return root;
    }

    private void mapDat(TreeNode tmp) {
        if (tmp == null)
            return;
        mapDat(tmp.right);
        sum += tmp.val;
        // System.out.println("sum = " + sum);
        tmp.val = sum;
        mapDat(tmp.left);
    }
}