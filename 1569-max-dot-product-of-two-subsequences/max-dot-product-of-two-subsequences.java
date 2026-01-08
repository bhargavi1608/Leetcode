class Solution {
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[][] dp = new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                dp[i][j]=Integer.MIN_VALUE;
            }
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                int prod = nums1[i-1]*nums2[j-1];
                int op1 = prod;
               int op2 = dp[i - 1][j - 1] == Integer.MIN_VALUE ? Integer.MIN_VALUE
                          : prod + dp[i - 1][j - 1];
                int op3 = dp[i-1][j];
                int op4 = dp[i][j-1];
                dp[i][j]=Math.max(Math.max(op1,op2),Math.max(op3,op4));
            }
        }
        return dp[m][n];
    }
}