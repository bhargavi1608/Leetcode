class Solution {
    
    public int[] searchRange(int[] nums, int target) {
        int[] arr ={-1,-1};
        
        int left=0;
        int right=nums.length-1;
        // first occurence
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]>=target){
                right=mid-1;
            }else{
                left=mid+1;
            }
            if(nums[mid]==target){
                arr[0]=mid;

            }
        }

        //find last occurence
        left=0;
        right=nums.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]<=target){
                left=mid+1;
            }else{
                right=mid-1;
            }
            if(nums[mid]==target) arr[1]=mid;
        }
        return arr;
        
    }
}