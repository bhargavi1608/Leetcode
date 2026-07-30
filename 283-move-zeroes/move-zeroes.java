class Solution {
    public void moveZeroes(int[] nums) {
        int k=0;
        int count=0;
        for(int num:nums){
            if(num!=0){
                nums[k++]=num;
            }
            if(num==0){
                count++;
            }
        }
        while(count>0 && k<nums.length){
            nums[k++]=0;
        }
        
    }
}