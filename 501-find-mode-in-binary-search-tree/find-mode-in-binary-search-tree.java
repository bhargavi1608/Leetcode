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
    public int[] findMode(TreeNode root) {
        Map<Integer,Integer> map = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode current = q.poll();
                map.put(current.val,map.getOrDefault(current.val,0)+1);
                if(current.left!=null) q.add(current.left);
                if(current.right!=null) q.add(current.right);
            }
        }
        int max = Collections.max(map.values());
        ArrayList<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            if(m.getValue()==max){
                list.add(m.getKey());
            }
        }
        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}