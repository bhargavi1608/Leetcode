class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        long totSum=(long)(n*(n+1))/2;
        long actSum = 0;
        for(int i=0;i<n;i++){
            actSum+=nums[i];
        }
        return (int)(totSum-actSum);
    }
}