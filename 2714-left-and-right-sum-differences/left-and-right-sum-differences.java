class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] res = new int[nums.length];
        int leftSum = 0;
        int rightSum=0;
        int totalSum=0;
        for(int i=0;i<nums.length;i++){
            totalSum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            rightSum=totalSum-nums[i];
            res[i]=Math.abs(leftSum-rightSum);
            leftSum+=nums[i];
            totalSum=rightSum;

        }
        
    return res;
    }
}