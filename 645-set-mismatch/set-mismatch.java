class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] freq = new int[nums.length+1];
        int dup=0;
        int mis=0;
        for(int num:nums){
            freq[num]++;
        }
        for(int i=1;i<=nums.length;i++){
            if(freq[i]==2){
                dup=i;
            }
            if(freq[i]==0){
                mis=i;
            }
        }
        return new int[]{dup,mis};
    }
}