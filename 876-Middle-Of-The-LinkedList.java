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
    // memory 39mb
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // fast 100% memory 40.1mb
    // public ListNode middleNode(ListNode head) {
    // int count = 0;
    // List<Integer> a = new ArrayList<>();
    // while ( head != null ){
    // a.add(head.val);
    // count++;
    // head = head.next;
    // }
    // int mid = count/2;
    // ListNode dum = new ListNode(0);
    // ListNode res = dum;
    // for ( int i = mid; i < count; i++ ){
    // res.next = new ListNode(a.get(i));
    // res = res.next;
    // }
    // return dum.next;
    // }
}