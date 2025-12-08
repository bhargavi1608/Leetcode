class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res=new int[2];
        int s=-1;
        int e=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                if(s==-1) s=i;
                e=i;
            }
        }
        res[0]=s;
        res[1]=e;
        return res;
    }
}