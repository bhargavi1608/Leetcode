class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int len = Integer.MAX_VALUE;
        int left=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                len = Math.min(len,i-left+1);
                sum-=nums[left];
                left++;
            }

        }
        return len==Integer.MAX_VALUE ? 0 : len;
    }
}