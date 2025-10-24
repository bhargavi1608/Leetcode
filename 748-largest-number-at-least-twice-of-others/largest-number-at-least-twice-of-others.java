class Solution {
    public int dominantIndex(int[] nums) {
        int maxIndex = -1;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
                maxIndex =i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i] !=max && max<2*nums[i]){
                return -1;
            }
        }
        return maxIndex;
    }
}