class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double windowSum=0;
        double sum=0;
        for(int i=0;i<k;i++){
            windowSum+=nums[i];
        }
        sum=windowSum;
        for(int i=k;i<nums.length;i++){
            windowSum+=nums[i]-nums[i-k];
            sum=Math.max(sum,windowSum);
        }
        double avg = sum/k;
        return avg;
    }
}