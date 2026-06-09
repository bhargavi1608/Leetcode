class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        long sum=0;
        for(int i=0;i<nums.length;i++){
            small = Math.min(small,nums[i]);
            large=Math.max(large,nums[i]);

        }
        sum=large-small;
        return sum*k;
    }
}