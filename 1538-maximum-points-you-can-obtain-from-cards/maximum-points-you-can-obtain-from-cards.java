class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int totalSum =0;
        for(int num:cardPoints){
            totalSum+=num;
        }
        int windowSum=0;
        int size = n-k;
        for(int i=0;i<size;i++){
            windowSum+=cardPoints[i];
        }
        int minSum = windowSum;
        for(int i=size;i<n;i++){
            windowSum+=cardPoints[i];
            windowSum-=cardPoints[i-size];
            minSum=Math.min(minSum,windowSum);
        }
        return totalSum-minSum;
    }
}