/*
// Definition for a Node.
class Node {
    public int val;
    public res<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, res<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        Stack<Node> stack = new Stack<>();
        stack.add(root);

        while (!stack.empty()) {
            root = stack.pop();
            res.add(root.val);
            for (int i = root.children.size() - 1; i >= 0; i--)
                stack.add(root.children.get(i));
        }

        return res;
    }
}