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
    public TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {
        if(root == p || root == q)
            return root;
        if(root.val > p.val && root.val < q.val) {
            return root;
        }
        if(root.val > q.val) {
            root = lowestCommonAncestor(root.left, p, q);
        } else if (root.val < p.val) {
            root = lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val > q.val) {
            TreeNode temp = p;
            p = q;
            q = temp;
        }
        return lca(root, p, q);
    }
}

// 2
//1 3
// p = 3 q = 1


