class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        int[] dp = new int[n];
        for(int i=0;i<n;i++){
            dp[i]=1;
        }
        int maxlen=1;
       
        for(int i=1;i<=n-1;i++){
            for(int j=0;j<=i-1;j++){
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);

                }
            }
            maxlen= Math.max(maxlen,dp[i]);
        }
        return maxlen;

    }
}