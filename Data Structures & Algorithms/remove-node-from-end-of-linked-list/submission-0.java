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
        ListNode node = new ListNode();
        node.next = head;
        ListNode temp = head;
        int c = 0;
        while(temp != null) {
            temp = temp.next;
            c++;
        }
        ListNode prev = node;
        temp = head;
        c = c - n;
        while(c != 0) {
            prev = temp;
            temp = temp.next;
            c--;
        }
        
        prev.next = temp.next;
        return node.next;
    }
}


