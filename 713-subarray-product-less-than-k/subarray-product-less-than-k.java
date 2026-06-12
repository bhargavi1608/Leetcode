class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        int left=0;
        int prod=1;
        if (k <= 1) return 0;
        for(int right=0;right<nums.length;right++){
            prod*=nums[right];
            
            while(prod>=k){
                prod/=nums[left];
                left++;
            }
                count+=(right-left+1);
            
           
        }
        return count;
    }
}