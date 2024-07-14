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
    public ListNode mergeNodes(ListNode head) {
        ListNode res = new ListNode(0);
        ListNode current = res;
        int sum = 0;
        head = head.next;
        while (head != null) {
            if (head.val != 0) {
                sum += head.val;
            } else {
                ListNode newNode = new ListNode(sum);
                current.next = newNode;
                current = current.next;
                sum = 0;
            }
            head = head.next;
        }
        return res.next;
    }

}