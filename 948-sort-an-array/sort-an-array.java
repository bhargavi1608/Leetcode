class Solution {
    public int[] sortArray(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
        
    }
    int[] mergeSort(int[] nums, int low, int high){
        if(low<high){
            int mid = low+(high-low)/2;
            mergeSort(nums,low,mid);
            mergeSort(nums,mid+1,high);
            merge(nums,low,mid,high);
        }
        return nums;
    }
    void merge(int[] nums, int low, int mid, int high){
        int i=low;
        int j=mid+1;
        int k=0;
        int[] temp = new int[high-low+1];
        while(i<=mid && j<=high){
            if(nums[i]<=nums[j]){
                temp[k++]=nums[i++];
            }else{
                temp[k++]=nums[j++];
            }
        }
        while(i<=mid){
            temp[k++]=nums[i++];
        }
         while(j<=high){
            temp[k++]=nums[j++];
        }
        for(int x = 0; x < temp.length; x++){
            nums[low + x] = temp[x];
        }
    }
}
