class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] even = new int[n/2];
        int[] odd = new int[n/2];
        int e=0;
        int o=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                even[e++]=nums[i];
               
            }else{
                odd[o++]=nums[i];
              
            }
        }
        int i=0;
        int j=0;
        int k=0;
        while(i<n/2 && j<n/2){
            res[k++]=even[i++];
            res[k++]=odd[j++];
        }
        return res;
    }
}