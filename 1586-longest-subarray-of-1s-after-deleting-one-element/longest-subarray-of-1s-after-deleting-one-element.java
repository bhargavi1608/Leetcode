class Solution {
    public int longestSubarray(int[] nums) {
        int ZeroC=0;
        int maxlen=0;
        int left=0;

        for(int right=0;right<nums.length;right++){
            if(nums[right]==0){
                ZeroC++;
            }
            while(ZeroC>1){
                if(nums[left]==0){
                    ZeroC--;
                }
                left++;
            }
            maxlen=Math.max(maxlen,right-left);
        }
        return maxlen;
    }
}