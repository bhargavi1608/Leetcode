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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null) return res;
        queue.add(root);
        boolean  leftToright=true;
        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            for(int i=0;i<size;i++){
                 TreeNode current = queue.poll();
                 list.add(current.val);
                 if(current.left!=null) queue.add(current.left);
                 if(current.right!=null) queue.add(current.right);
            }
            if(leftToright){
                res.add(list);
            }else{
               Collections.reverse(list);
               res.add(list);
            }
            leftToright=!leftToright;
        }
        return res;
    }
}