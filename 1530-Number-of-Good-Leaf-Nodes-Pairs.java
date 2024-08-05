class Solution {

    public int countPairs(TreeNode root, int d) {
        return postOrder(root, d)[11];
    }

    private int[] postOrder(TreeNode root, int d) {
        if (root == null) return new int[12];
        else if (root.left == null && root.right == null) {
            int[] c = new int[12];
            c[0] = 1;
            return c;
        }

        int[] l = postOrder(root.left, d);
        int[] r = postOrder(root.right, d);

        int[] c = new int[12];
        for (int i = 0; i < 10; i++)
            c[i + 1] += l[i] + r[i];

        c[11] += l[11] + r[11];

        for (int d1 = 0; d1 <= d; d1++) {
            for (int d2 = 0; d2 <= d; d2++) {
                if (2 + d1 + d2 <= d)
                    c[11] += l[d1] * r[d2];
            }
        }

        return c;
    }
}