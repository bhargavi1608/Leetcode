class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int max=Integer.MIN_VALUE;
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                count++;
            }else{
                count=0;
            }
            max=Math.max(max,count);
        }
        return max+1;
    }
}