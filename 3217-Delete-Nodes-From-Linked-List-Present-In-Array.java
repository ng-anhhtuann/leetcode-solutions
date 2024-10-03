/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode modifiedList(int[] nums, ListNode root) {
        int max = 0;
        for (int i : nums) max = Math.max(max, i);

        boolean[] v = new boolean[max + 1];

        for (int i : nums) v[i] = true;

        while (root != null && root.val <= max && v[root.val] == true) root = root.next;

        if (root == null) return root;

        ListNode ptr = root;

        while (ptr.next != null) {
            if (ptr.next.val <= max && v[ptr.next.val])
                ptr.next = ptr.next.next;
            else
                ptr = ptr.next;
        }
        return root;
    }

/** Slow solution 21 ms*/
    // public ListNode modifiedList(int[] nums, ListNode root) {
    //     Map<Integer, Integer> map = new HashMap<>();
    //     int n = nums.length;
    //     for (int i : nums)
    //         map.put(i, 1);

    //     ListNode node = new ListNode();
    //     ListNode dum = node;
    //     while (root != null) {
    //         if (map.get(root.val) == null) {
    //             if (dum == null) {
    //                 dum = new ListNode(root.val);
    //             } else {
    //                 ListNode curr = new ListNode(root.val);
    //                 dum.next = curr;
    //                 dum = dum.next;
    //             }
    //         }
    //         root = root.next;
    //     }
    //     dum.next = null;
    //     return node.next;
    // }
}