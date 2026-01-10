class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n+1][m+1];
        dp[n][m]=0;
        for(int j=m-1;j>=0;j--){
            dp[n][j]=dp[n][j+1]+s2.charAt(j);
        }
        for(int i=n-1;i>=0;i--){
            dp[i][m]=dp[i+1][m]+s1.charAt(i);
        }

        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                if(s1.charAt(i)==s2.charAt(j)){
                    dp[i][j]=dp[i+1][j+1];

                }else{
                    int deleteFroms1 = s1.charAt(i)+dp[i+1][j];
                    int deleteFroms2 = s2.charAt(j)+dp[i][j+1];
                    dp[i][j]=Math.min(deleteFroms1,deleteFroms2);
                }
            }
        }
        return dp[0][0];
    }
}