class Solution {
    public int maxSubArray(int[] nums) {
        int max_so_far = Integer.MIN_VALUE;
        int curr_sum = 0;
        for(int num:nums){
            curr_sum+=num;
            if(curr_sum>max_so_far){
                max_so_far=curr_sum;
            }
            if(curr_sum<0){
                curr_sum=0;
            }
        }
        return max_so_far;
    }
}