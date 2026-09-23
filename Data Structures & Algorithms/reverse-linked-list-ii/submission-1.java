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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode temp = dummy;
        ListNode curr = head;
        int idx = 1;
        while (idx < left) {
            temp = curr;
            curr = curr.next;
            idx++;
        }
        ListNode prev = temp, next = null;
        while (left <= right) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            left++;
        }
        temp.next.next = curr;
        temp.next = prev;
        
        return dummy.next;
    }
}