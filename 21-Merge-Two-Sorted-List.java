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
    public ListNode mergeTwoLists(ListNode a, ListNode b) {
        if (a == null && b != null) {
            return b;
        } else if (a != null && b == null) {
            return a;
        } else if (a == null && b == null) {
            return a;
        } else {
            ListNode dummy = new ListNode(0);
            ListNode res = dummy;
            while (a != null || b != null) {
                if (b == null) {
                    res.next = new ListNode(a.val);
                    res = res.next;
                    a = a.next;
                } else if (a == null) {
                    res.next = new ListNode(b.val);
                    res = res.next;
                    b = b.next;
                } else {
                    if (a.val > b.val) {
                        res.next = new ListNode(b.val);
                        res = res.next;
                        b = b.next;
                    } else {
                        res.next = new ListNode(a.val);
                        res = res.next;
                        a = a.next;
                    }
                }
            }
            return dummy.next;
        }
    }

}