class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        int count=0;
        int MOD = 1000000007;
        int[] pow = new int[nums.length];
        pow[0]=1;
        for(int i=1;i<nums.length;i++){
            pow[i]=(pow[i-1]*2)%MOD;
        }
        while(left<=right){
            if(nums[left]+nums[right]<=target){
                count=(count+pow[right-left])%MOD;
                left++;
            }else{
                right--;
            }
           
        }
    
        return count;
    }
}