class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int num =1;
        for(int i=0;i<n;i++){
            if(nums[i]==num && nums[i]>=1){
                num++;
            }
        }
        return num;
    }
}