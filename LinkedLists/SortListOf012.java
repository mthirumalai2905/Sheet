class Solution {
    public ListNode segregate(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        // Initialize pointers for 0s, 1s, and 2s
        ListNode zeroDummy = new ListNode(0);
        ListNode oneStart = new ListNode(0);
        ListNode twoStart = new ListNode(0);
        
        ListNode zeroTail = zeroDummy;
        ListNode oneTail = oneStart;
        ListNode twoTail = twoStart;
        
        ListNode current = head;
        
        // Traverse the original list
        while (current != null) {
            if (current.val == 0) {
                zeroTail.next = current;
                zeroTail = zeroTail.next;
            } else if (current.val == 1) {
                oneTail.next = current;
                oneTail = oneTail.next;
            } else { // current.val == 2
                twoTail.next = current;
                twoTail = twoTail.next;
            }
            current = current.next;
        }
        
        // Connect the three partitions
        zeroTail.next = oneStart.next;
        oneTail.next = twoStart.next;
        twoTail.next = null; // terminate the end of the list
        
        // Return the new head which starts with 0s
        return zeroDummy.next;
    }
}
