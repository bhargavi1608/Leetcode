class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null) return false;

        // Either path starts at this node, or somewhere in left/right subtree
        return dfs(head, root) || 
               isSubPath(head, root.left) || 
               isSubPath(head, root.right);
    }

    // Check if linked list matches a downward path starting from this tree node
    private boolean dfs(ListNode head, TreeNode root) {
        if (head == null) return true;   // all list matched
        if (root == null) return false;  // tree ended early

        if (head.val != root.val) return false;

        // Continue matching list with left or right subtree
        return dfs(head.next, root.left) || dfs(head.next, root.right);
    }
}
