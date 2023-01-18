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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        ListNode dum = new ListNode(0);
        dum.next = head;
        ListNode prev = dum;
        ListNode current = head;
        int count = 0;
        while (current != null) {
            count++;
            if (count % k == 0) {
                prev = reverseKNodes(prev, current.next);
                current = prev.next;
            } else {
                current = current.next;
            }
        }
        return dum.next;
    }

    private ListNode reverseKNodes(ListNode prev, ListNode next) {
        ListNode last = prev.next;
        ListNode current = last.next;
        while (current != next) {
            last.next = current.next;
            current.next = prev.next;
            prev.next = current;
            current = last.next;
        }
        return last;
    }
}