class Solution {
    public int integerBreak(int n) {
        if(n==2) return 1;
        if(n==3) return 2;
        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                int maxproduct = Math.max(j*(i-j),(j*dp[i-j]));
                dp[i]=Math.max(dp[i],maxproduct);
            }
        }
        return dp[n];
    }
}