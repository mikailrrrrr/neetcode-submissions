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
        ListNode temp = head;
        int idx = 1;
        ListNode reverse = null;
        while(idx < left) {
            reverse = temp;
            temp = temp.next;
            idx++;
        }
        ListNode prev = null, cur = temp, next = null;

        while(left <= right) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            left++;
        }

        if(reverse != null) {
            temp.next = cur;
            reverse.next = prev;
            return head;
        } else {
            head.next = cur;
            return prev;
        }
    }
}