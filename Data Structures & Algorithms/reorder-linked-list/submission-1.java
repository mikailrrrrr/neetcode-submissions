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
    public ListNode rec(ListNode list1, ListNode list2, int num) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        if (num % 2 == 0) {
            list1.next = rec(list1.next, list2, num + 1);
            return list1;
        } else {
            list2.next = rec(list1, list2.next, num + 1);
            return list2;
        }
    }
    public void reorderList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        if (head == null)
            return;

        ListNode slow = head, fast = head.next;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode prev = null, next = null;
        ListNode curr = slow.next;
        slow.next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = rec(head, prev, 0);
    }
}
