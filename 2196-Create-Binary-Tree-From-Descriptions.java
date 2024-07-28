class Solution {

    public TreeNode createBinaryTree(int[][] a) {
        Map<Integer, TreeNode> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for (int[] i : a) {
            int rootVal = i[0];
            int child = i[1];
            boolean isLeft = i[2] == 1;

            if (!map.containsKey(rootVal)) {
                map.put(rootVal, new TreeNode(rootVal));
            }
            if (!map.containsKey(child)) {
                map.put(child, new TreeNode(child));
            }

            if (isLeft) {
                map.get(rootVal).left = map.get(child);
            } else {
                map.get(rootVal).right = map.get(child);
            }

            set.add(child);
        }

        for (TreeNode node : map.values()) {
            if (!set.contains(node.val)) {
                return node;
            }
        }

        return null;
    }
}