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
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        ListNode dum = new ListNode(0);
        ListNode res = dum;
        while (head != null) {
            if (head.val != val) {
                res.next = new ListNode(head.val);
                res = res.next;
            }
            head = head.next;
        }
        return dum.next;
    }
}