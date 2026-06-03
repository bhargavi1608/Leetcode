class Solution {
    public int findLengthOfLCIS(int[] nums) {
        
        int max=1;
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                count++;
            }else{
                count=1;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}