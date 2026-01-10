class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth =Integer.MIN_VALUE;
       
        for(int[] nums:accounts){
            int sum=0;
            for(int num:nums){
                 sum+=num;
            }
            maxWealth = Math.max(maxWealth,sum);
        }
        return maxWealth;
    }
}