class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ZeroCount =0;
        long ans =0;
        for(int num:nums){
            if(num==0){
                ZeroCount++;
                ans+=ZeroCount;
            }else{
                ZeroCount=0;
            }
        }
        return ans;
    }
}