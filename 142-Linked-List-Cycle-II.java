/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null)
            return head;
        ListNode a = head, b = head;
        while (a != null && a.next != null) {
            b = b.next;
            a = a.next.next;
            if (a == b)
                break;
        }
        if (a == null || a.next == null)
            return null;
        while (head != b) {
            head = head.next;
            b = b.next;
        }
        return head;
    }
}