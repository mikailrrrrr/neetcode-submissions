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
    int idx = 0;
    public TreeNode dfs(int[] arr, int l, int r, Map<Integer, Integer> mp) {
        if (l > r)
            return null;

        TreeNode node = new TreeNode(arr[idx++]);
        int mid = mp.get(node.val);
        node.left = dfs(arr, l, mid - 1, mp);
        node.right = dfs(arr, mid + 1, r, mp);
        return node;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> mp = new HashMap<>();
        int index = 0;
        for (int num : inorder) {
            mp.put(num, index);
            index++;
        }

        return dfs(preorder, 0, preorder.length-1, mp);
    }
}
