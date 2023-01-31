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
    // ===============================================merge sort
    public ListNode mergeKLists(ListNode[] lists) {
        return merge(lists, 0, lists.length - 1);
    }

    private ListNode merge(ListNode[] lists, int start, int end) {
        if (start > end) {
            return null;
        }
        if (start == end) {
            return lists[start];
        }
        int mid = start + (end - start) / 2;
        ListNode left = merge(lists, start, mid);
        ListNode right = merge(lists, mid + 1, end);
        return mergeTwoLists(left, right);
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        if (l1 != null) {
            tail.next = l1;
        }
        if (l2 != null) {
            tail.next = l2;
        }
        return dummy.next;
    }

    // ====================================2nd
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> values = new ArrayList<>();
        for (ListNode head : lists) {
            while (head != null) {
                values.add(head.val);
                head = head.next;
            }
        }
        Collections.sort(values);
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        for (int val : values) {
            tail.next = new ListNode(val);
            tail = tail.next;
        }
        return dummy.next;
    }

    // ================================================worst way
    public ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length;
        if (len == 0) {
            ListNode head = new ListNode();
            head = null;
            return head;
        }
        if (len == 1) {
            return lists[0];
        }
        ListNode res = lists[0];
        for (int i = 1; i < len; i++) {
            res = mergeTwoLists(res, lists[i]);
        }
        return res;
    }

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