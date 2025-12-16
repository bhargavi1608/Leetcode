class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isIncrease=true;
        boolean isDecrease=true;
       
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                  isIncrease=false;
                  
            }
            else if(nums[i-1]<nums[i]){
                  isDecrease=false;
                  
            }
        }
        return isIncrease||isDecrease;
    }
}