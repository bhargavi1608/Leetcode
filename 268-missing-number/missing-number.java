class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        long expectedsum=(long)(n*(n+1)/2);
        long actualSum=0;
        for(int num:nums){
            actualSum+=num;
        }
        return (int)(expectedsum-actualSum);
    }
}