class Solution {
    public double minimumAverage(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        int left=0;
        int right=nums.length-1;
        double[] res= new double[n/2];
        Arrays.sort(nums);
        int k=0;
        while(left<right){
            double avg = (nums[left]+nums[right])/2.0;
            res[k]=avg;
            left++;
            right--;
            k++;
        }
        double minr=Double.MAX_VALUE;
        for(double num:res){
            if(num<=minr){
                minr=num;
            }
        }
        return minr;
    }
}