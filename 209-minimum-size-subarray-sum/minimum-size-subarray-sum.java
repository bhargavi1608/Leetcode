class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left =0;
        int min=nums.length,sum=0,totalSum=0;
        for(int num:nums){
            totalSum+=num;
        }
        if(totalSum<target){
            return 0;
        }
        if(totalSum==target){
            return nums.length;
        }
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                min=Math.min(min,i-left+1);
                sum-=nums[left];
                left++;
            }
        }
        return min;
        
        
    }
}