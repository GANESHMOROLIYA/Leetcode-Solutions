class Solution {
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode after = null;
        ListNode prev = null;
        while (curr != null) {
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }

    public int pairSum(ListNode head) {
        int maxSum = Integer.MIN_VALUE; 
        ListNode fast = head;
        ListNode slow = head;
        
       
        while (fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

       
        slow.next = reverse(slow.next);

       
        ListNode p1 = head;
        ListNode p2 = slow.next;
        while (p2 != null) {
            int sum = p1.val + p2.val;
            if (maxSum < sum) {
                maxSum = sum;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        return maxSum;
    }
}
