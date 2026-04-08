class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] res = new int[nums.length];
        int i=0;
        int j = nums.length-1;
        for(int num:nums){
            if(num%2==0){
                res[i++]=num;
            }else{
                res[j--]=num;
            }
        }
        return res;
    }
}