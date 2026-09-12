/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> mp = new HashMap<>();
        mp.put(null, null);
        Node temp = head;
        while(temp != null) {
            if(!mp.containsKey(temp)) {
                mp.put(temp, new Node(0));
            }
            mp.get(temp).val = temp.val;

            if(!mp.containsKey(temp.next)) {
                mp.put(temp.next, new Node(0));
            }
            mp.get(temp).next = mp.get(temp.next);

            if(!mp.containsKey(temp.random)) {
                mp.put(temp.random, new Node(0));
            }
            mp.get(temp).random = mp.get(temp.random);
            temp = temp.next;
        }

        return mp.get(head);
    }
}
