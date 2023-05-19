/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// 1 2 3 4 5 
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        ListNode res = null;
        while ( head != null ){
            ListNode node = head.next;
            head.next = res;
            res = head;
            head = node;
        }
        return res;
    }
}