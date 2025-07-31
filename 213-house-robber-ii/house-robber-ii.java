class Solution {
    public int rob(int[] nums) {
        int lootSkippedLast=0;
        int  lootSkippedFirst=0;
        if(nums.length<2) return nums[0];
        int[] skipLastHouse = new int [nums.length-1];
        int[] skipFirstHouse = new int [nums.length-1];
        for(int i=0;i<=nums.length-2;i++){
            skipLastHouse[i]=nums[i];
            skipFirstHouse[i]=nums[i+1];
            
            
        }
        lootSkippedLast=robHelper(skipLastHouse,nums.length-1);
        lootSkippedFirst=robHelper(skipFirstHouse,nums.length-1);
              
        return  Math.max(lootSkippedLast,lootSkippedFirst);
      
    }
    public int robHelper(int[] House,int n) {
       
        if(n==0) return 0;
        if(n==1) return House[0];
        int[] dp = new int[n];
        dp[0]=House[0];
        dp[1]=Math.max(House[0],House[1]);
        for(int i=2;i<=n-1;i++){
            dp[i]=Math.max(dp[i-2]+House[i],dp[i-1]);
        }
        return dp[n-1];
    }
}