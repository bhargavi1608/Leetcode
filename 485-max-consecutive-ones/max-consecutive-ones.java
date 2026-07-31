class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int mc=0;
        for(int num:nums){
            if(num==1){
                c++;
            }else{
                c=0;
            }
            mc=Math.max(c,mc);
        }
        return mc;
    }
}