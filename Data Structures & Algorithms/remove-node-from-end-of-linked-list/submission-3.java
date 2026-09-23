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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null)
            return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = head;
        int idx = 0;
        while(idx < n) {
            first = first.next;
            idx++;
        }
        ListNode second = head;
        ListNode prev = null;
        while(first != null) {
            prev = second;
            second = second.next;
            first = first.next;
        }

        if(prev == null) {
            return second.next;
        } else {
            prev.next = second.next;
        }

        return dummy.next;
    }
}