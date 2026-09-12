/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    boolean isBalance = true;
    public int height(TreeNode node) {
        if(node == null)
            return 0;
        int leftNode = height(node.left);
        int rightNode = height(node.right);

        if(Math.abs(leftNode - rightNode) > 1)
            isBalance = false;

        return Math.max(leftNode, rightNode) + 1;
    }
    public boolean isBalanced(TreeNode root) {
        height(root);
        return isBalance;
    }
}
