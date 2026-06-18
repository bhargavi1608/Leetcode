class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        long sum=0;
        long maxSum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(i>=k){
                sum-=nums[i-k];
                map.put(nums[i-k],map.get(nums[i-k])-1);
                if(map.get(nums[i-k])==0){
                    map.remove(nums[i-k]);
                }
            }
            // Valid windowsize 
            
           if(i>=k-1 && map.size()==k){
            maxSum=Math.max(maxSum,sum);
           }
        }
        return maxSum;
    }
}