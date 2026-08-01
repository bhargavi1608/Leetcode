class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] res = new int[nums.length];
        int[] pos = new int[nums.length/2];
        int[] neg = new int[nums.length/2];
        int p=0;
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                neg[p++]=nums[i];
            }else{
                pos[n++]=nums[i];
            }
        }
        p=0; n=0;
        int i=0;

        while(p<nums.length/2 && n<nums.length/2 && i<nums.length){
            res[i++]=pos[p++];
            res[i++]=neg[n++];
        }
        return res;
    }
}