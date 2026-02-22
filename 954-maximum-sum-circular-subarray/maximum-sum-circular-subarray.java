class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum=nums[0];
        int currmaxSum=nums[0];
        int currminSum=nums[0];
        int minSum=nums[0];
        int maxSum = nums[0];
        for(int i=1;i<nums.length;i++){
            // Kandanes algorithm for max sum
            currmaxSum=Math.max(currmaxSum+nums[i],nums[i]);
            maxSum = Math.max(currmaxSum,maxSum);
            // Kandanes algorithm for min sum
            currminSum = Math.min(currminSum+nums[i],nums[i]);
            minSum=Math.min(currminSum,minSum);  
            totalSum+=nums[i];
            
        }
        int normalSum = maxSum;
        int circularSum = totalSum-minSum;
        if(minSum==totalSum){
            return maxSum;
        }
        return Math.max(normalSum,circularSum);
    }
}