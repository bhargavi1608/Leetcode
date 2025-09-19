class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] arr = new int[queries.length];
        int sum=0;
        for(int num:nums){
            if(num%2==0){
                sum+=num;
            }
        }
        for(int i=0;i<queries.length;i++){
            int val = queries[i][0];
            int index = queries[i][1];
            if(nums[index]%2==0){
                sum-=nums[index];
            }
            nums[index]=nums[index]+val;
            if(nums[index]%2==0){
                sum+=nums[index];
            }
            arr[i]=sum;
        }
        return arr;
    }
}