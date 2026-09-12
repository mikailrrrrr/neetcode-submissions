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
    public void reorderList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;

        while(temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        int r = list.size()-1;
        int l = 0;
        int n = list.size();
        for(int i = 0; i < n;i++) {
            if(i % 2 == 0) {
                head.val = list.get(l++);
            } else {    
                head.val = list.get(r--);
            }
            head = head.next;
        }
        
        
    }
}
