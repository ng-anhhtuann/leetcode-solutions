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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] a = new int[] { -1, -1 };
        ListNode dum;
        int pos = 1;
        int count = 0;
        int prev = head.val;
        dum = head.next;
        int firstPos = 0;
        int prevPos = 0;
        while (dum != null) {
            pos++;
            if (dum.next == null)
                return (count < 2) ? new int[] { -1, -1 } : a;
            if ((dum.next.val < dum.val && dum.val > prev)
                || (dum.next.val > dum.val && dum.val < prev)) {
                count++;
                if (count >= 2) {
                    a[0] = (a[0] == -1) ? pos - firstPos : Math.min(a[0], pos - prevPos);
                    a[1] = Math.max(a[1], pos - firstPos);
                    prevPos = pos;
                } else {
                    firstPos = pos;
                    prevPos = pos;
                }
            }
            prev = dum.val;
            dum = dum.next;
        }
        return a;
    }
}