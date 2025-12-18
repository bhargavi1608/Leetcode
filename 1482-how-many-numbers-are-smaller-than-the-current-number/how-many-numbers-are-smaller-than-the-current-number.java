class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] freq = new int[101];
        for(int num:nums){
            freq[num]++;
        }
        for(int i=1;i<101;i++){
            freq[i]+=freq[i-1];
        }
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                res[i]=0;
            }else{
                res[i]=freq[nums[i]-1];
            }
        }
        return res;
    }
}