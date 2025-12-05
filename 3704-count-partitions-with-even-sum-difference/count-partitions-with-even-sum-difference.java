class Solution {
    public int countPartitions(int[] nums) {
       int ls=nums[0];
       int rs=0;
       int count=0;
       for(int i=1;i<nums.length;i++){
           rs+=nums[i];
       }
      
       for(int i=1;i<nums.length;i++){
           if((ls-rs)%2==0) count++;
           ls+=nums[i];
           rs-=nums[i];
       }
       return count;
    }
}