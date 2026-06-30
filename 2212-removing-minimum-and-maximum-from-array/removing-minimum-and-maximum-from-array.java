class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int minIdx=0;
        int maxIdx=0;
        for(int i=0;i<n;i++){
            if(nums[i]<nums[minIdx]){
                minIdx=i;
            }
            if(nums[i]>nums[maxIdx]){
                maxIdx=i;
            }
        }
        int front = Math.max(minIdx,maxIdx)+1;
        int back =n- Math.min(minIdx,maxIdx);
        int both = Math.min(minIdx,maxIdx)+1+(n-Math.max(minIdx,maxIdx));
        return Math.min(front,Math.min(back,both));
    }
}