/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    /** 5ms */
    // public List<Integer> postorder(Node root) {
    //     List<Integer> lst = new ArrayList<>();
    //     Stack<Node> stack = new Stack<>();
    //     stack.push(root);
    //     if (root == null)
    //         return lst;
    //     while (!stack.isEmpty()) {
    //         Node node = stack.pop();
    //         lst.add(node.val);
    //         for (Node curr : node.children)
    //             stack.push(curr);
    //     }
    //     Collections.reverse(lst);
    //     return lst;
    // }

    /** 1ms */
    public List<Integer> postorder(Node root) {
        List<Integer> lst = new ArrayList<>();
        if (root == null) return lst;
        traverse(root,lst);
        return lst;
    }
    private void traverse(Node root, List<Integer> lst) {
        if (root == null ) return;
        for (Node node : root.children)
            traverse(node,lst);
        lst.add(root.val);
    }
}