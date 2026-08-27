class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};
        int start = -1;
        int last = -1;
        int low=0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]>=target){
                high=mid-1;
            }else{
                low=mid+1;
            }
            if(nums[mid]==target){
                res[0]=mid;
            }
        }
        low=0;
        high = nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]<=target){
                low=mid+1;
            }else{
                high=mid-1;
            }
            if(nums[mid]==target){
                res[1]=mid;
            }
        }
        return res;
    }
}