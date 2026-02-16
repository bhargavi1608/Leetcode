class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int res = n;
        for(int i=0;i<nums.length;i++){
            res = res^(i^nums[i]);
        }
        return res;
    }
}