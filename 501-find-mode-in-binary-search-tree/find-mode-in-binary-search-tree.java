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
    private Integer preVal = null;
    private int count=0;
    private int maxCount=0;
    ArrayList<Integer> result = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        inorder(root);
        int[] arr = new int[result.size()];
        for(int i=0;i<result.size();i++){
            arr[i]=result.get(i);
        }
        return arr;
    }
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);

        if(preVal!=null && root.val==preVal){
            count++;

        }else{
            count=1;
        }

        if(count>maxCount){
            maxCount=count;
            result.clear();
            result.add(root.val);
        }else if(count==maxCount){
            result.add(root.val);
        }

        preVal = root.val;
        inorder(root.right);
    }

}