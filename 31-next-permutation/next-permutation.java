class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx = -1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx=i;
                break;
            }
        }
        if(idx==-1){
             reverse(nums,0,n-1);
             return;
        }
        for(int i=n-1;i>=0;i--){
            if(nums[i]>nums[idx]){
                swap(nums,i,idx);
                break;
            }
        }
        reverse(nums,idx+1,n-1);
    }
    public static void reverse(int[] nums,int start,int end){
            while(start<=end){
                swap(nums,start++,end--);
            }
    }
    public static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}