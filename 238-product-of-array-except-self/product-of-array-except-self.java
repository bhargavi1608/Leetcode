class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output= new int[nums.length];
        int n=nums.length;
        output[0]=1;
        for(int i=1;i<nums.length;i++){
            output[i]= output[i-1]*nums[i-1];

        }
        int right=1;
        for(int i=n-1;i>=0;i--){
            output[i]=output[i]*right;
            right*=nums[i];
        }
        return output;
      }
}