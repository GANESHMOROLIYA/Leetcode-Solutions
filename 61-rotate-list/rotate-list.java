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
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
       
        int len = 1;
        ListNode fast = head;
        while (fast.next != null) {
            fast = fast.next;
            len++;
        }

        // Step 2: Handle if k >= length
        k = k % len;
        if (k == 0) return head;

        // Step 3: Make it circular
        fast.next = head;

        // Step 4: Move to new tail
        int stepsToNewTail = len - k;
        ListNode slow = head;
        for (int i = 1; i < stepsToNewTail; i++) {
            slow = slow.next;
        }

        // Step 5: Break the circle and return new head
        head = slow.next;
        slow.next = null;

        return head;
    }
}