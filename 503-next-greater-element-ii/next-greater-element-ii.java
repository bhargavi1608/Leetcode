class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int[] res = new int[n];
        for(int i=2*n-1;i>=0;i--){
            int idx = i%n;
            while(!st.isEmpty() && st.peek()<=nums[idx]){
                st.pop();
            }
            if(i<n){
                res[idx]=st.isEmpty() ? -1 : st.peek();
            }
            st.push(nums[idx]);
        }
       
        
        return res;

    }
}