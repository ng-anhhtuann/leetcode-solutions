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
// class Solution {
// public ListNode[] splitListToParts(ListNode head, int k) {
// ListNode[] list = new ListNode[k];
// List<Integer> store = new ArrayList<>();
// ListNode tmp = head;
// while (tmp != null) {
// store.add(tmp.val);
// tmp = tmp.next;
// }
// int sz = store.size();
// int qt = sz / k;
// int rmd = sz % k;
// int idx = 0;

// for (int i = 0; i < k; i++) {
// int partSize = qt + (i < rmd ? 1 : 0);
// list[i] = createNode(store, idx, idx + partSize - 1);
// idx += partSize;
// }

// return list;
// }

// public ListNode createNode(List<Integer> arrayList, int start, int end) {
// ListNode dummy = new ListNode();
// ListNode current = dummy;

// for (int i = start; i <= end; i++) {
// current.next = new ListNode(arrayList.get(i));
// current = current.next;
// }

// return dummy.next;
// }
// }

class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] list = new ListNode[k];
        int sz = 0;
        ListNode tmp = head;

        while (tmp != null) {
            tmp = tmp.next;
            sz++;
        }

        int pos = sz / k;
        int rem = sz % k;
        tmp = head;
        ListNode prev = null;

        for (int i = 0; i < k; i++) {
            list[i] = tmp;
            int partSize = pos + (i < rem ? 1 : 0);

            for (int j = 0; j < partSize; j++) {
                prev = tmp;
                tmp = tmp.next;
            }

            if (prev != null) {
                prev.next = null;
            }
        }

        return list;
    }
}
