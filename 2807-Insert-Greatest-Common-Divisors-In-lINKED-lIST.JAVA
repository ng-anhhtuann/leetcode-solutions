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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode ptr = head;
        if (ptr.next == null) return head;
        while (ptr.next != null) {
            int tmp = gcd(ptr.next.val, ptr.val);
            ListNode newNode = new ListNode(tmp);
            newNode.next = ptr.next;
            ptr.next = newNode;
            ptr = ptr.next.next;
        }
        return head;
    }

    public int gcd(int a, int b) {
        int g = a > b ? a : b;
        int s = a < b ? a : b;
        if (s == 0)
            return g;
        while (g > s) {
            if (g % s == 0) {
                return s;
            } else {
                g = g % s;
                if (g < s) {
                    int tmp = g;
                    g = s;
                    s = tmp;
                }
            }
        }
        return s;
    }
}