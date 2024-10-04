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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] a = new int[m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = -1;

        int top = 0, bot = m - 1;
        int lt = 0, rt = n - 1;

        while (head != null) {
            for (int i = lt; i <= rt && head != null; i++) {
                a[top][i] = head.val;
                head = head.next;
            }
            top++;

            for (int i = top; i <= bot && head != null; i++) {
                a[i][rt] = head.val;
                head = head.next;
            }
            rt--;

            for (int i = rt; i >= lt && head != null; i--) {
                a[bot][i] = head.val;
                head = head.next;
            }
            bot--;

            for (int i = bot; i >= top && head != null; i--) {
                a[i][lt] = head.val;
                head = head.next;
            }
            lt++;
        }

        return a;
    }
}