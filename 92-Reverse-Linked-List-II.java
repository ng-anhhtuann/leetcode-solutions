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
// class Solution {
//     public ListNode reverseBetween(ListNode head, int l, int r) {
//         int count = 1;
//         if (head == null || l == r) return head;

//         ListNode dummy = new ListNode();
//         dummy.next = head;
//         ListNode prev = dummy;
//         ListNode current = head;

//         while (count < l) {
//             prev = current;
//             current = current.next;
//             count++;
//         }

//         ListNode tail = current;
//         ListNode reverseNode = null;

//         while (count <= r) {
//             ListNode next = current.next;
//             current.next = reverseNode;
//             reverseNode = current;
//             current = next;
//             count++;
//         }

//         prev.next = reverseNode;
//         tail.next = current;

//         return dummy.next;
//     }
// }


class Solution {
    public ListNode reverseBetween(ListNode head, int l, int r) {
        if (head == null || l == r) return head;

        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prev = dummy;

        for (int i = 1; i < l; i++) {
            prev = prev.next;
        }

        ListNode current = prev.next;
        ListNode next = current.next;

        for (int i = l; i < r; i++) {
            current.next = next.next;
            next.next = prev.next;
            prev.next = next;
            next = current.next;
        }

        return dummy.next;
    }
}
