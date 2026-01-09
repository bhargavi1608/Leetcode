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

     private class Pair {
        int depth;
        TreeNode node;

        Pair(int depth, TreeNode node) {
            this.depth = depth;
            this.node = node;
        }
    }
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return dfs(root).node;
    }
    private Pair dfs(TreeNode root) {
        // Base case
        if (root == null) {
            return new Pair(0, null);
        }

        // Recurse left and right
        Pair left = dfs(root.left);
        Pair right = dfs(root.right);

        // Compare depths
        if (left.depth > right.depth) {
            return new Pair(left.depth + 1, left.node);
        } else if (right.depth > left.depth) {
            return new Pair(right.depth + 1, right.node);
        } else {
            // Both sides have same deepest depth
            return new Pair(left.depth + 1, root);
        }
    }
}