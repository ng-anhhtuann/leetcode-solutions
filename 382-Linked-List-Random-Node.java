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
import java.util.Random;

class Solution {
    ListNode head;
    Random rand;
    public Solution(ListNode head) {
        this.head = head;
        this.rand = new Random();
    }
    public int getRandom() {
        int count = 0;
        ListNode curr = this.head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        int randIndex = rand.nextInt(count);
        curr = this.head;
        for (int i = 0; i < randIndex; i++) {
            curr = curr.next;
        }
        return curr.val;
    }
}


/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */