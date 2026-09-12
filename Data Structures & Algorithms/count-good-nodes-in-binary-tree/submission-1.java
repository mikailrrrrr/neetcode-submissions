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
    public int dfs(TreeNode root, int max) {
        if (root == null)
            return 0;
        if (root.val >= max) {
            max = root.val;
        }
        int left = dfs(root.left, max);
        int right = dfs(root.right, max);

        if (root.val >= max)
            return left + right + 1;
        return left + right;
    }
    public int goodNodes(TreeNode root) {
        if (root == null)
            return 0;
        int max = root.val;
        return dfs(root, max);
    }
}
