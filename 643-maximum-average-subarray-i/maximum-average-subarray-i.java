class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg = Integer.MIN_VALUE;
        double maxAvg = Integer.MIN_VALUE;
        double sum =0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        avg = sum/k;
        maxAvg=Math.max(avg,maxAvg);
        for(int i=k;i<nums.length;i++){

            sum-=nums[i-k];
            sum+=nums[i];
            avg=sum/k;
            maxAvg = Math.max(avg,maxAvg);
        }
        return maxAvg;
    }
}