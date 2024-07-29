class Solution {

    public String getDirections(TreeNode root, int s, int t) {
        StringBuilder ssb = new StringBuilder();
        StringBuilder dsb = new StringBuilder();

        findPath(root, s, ssb);
        findPath(root, t, dsb);

        StringBuilder dir = new StringBuilder();
        int len = 0;

        while (
            len < ssb.length() &&
                len < dsb.length() &&
                ssb.charAt(len) ==
                    dsb.charAt(len)
        ) {
            len++;
        }

        for (int i = 0; i < ssb.length() - len; i++) {
            dir.append("U");
        }

        for (int i = len; i < dsb.length(); i++) {
            dir.append(dsb.charAt(i));
        }

        return dir.toString();
    }

    private boolean findPath(TreeNode node, int target, StringBuilder path) {
        if (node == null) {
            return false;
        }

        if (node.val == target) {
            return true;
        }

        path.append("L");
        if (findPath(node.left, target, path)) {
            return true;
        }
        path.deleteCharAt(path.length() - 1); // Remove last character
        path.append("R");
        if (findPath(node.right, target, path)) {
            return true;
        }
        path.deleteCharAt(path.length() - 1); // Remove last character

        return false;
    }
}