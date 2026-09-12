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
        while(n!=0) {
            temp = temp.next;
            n--;
        }
        ListNode t=node;
        while(temp != null) {
            temp=temp.next;
            t=t.next;
        }
        t.next = t.next.next;
        

        return node.next;
    }
}


