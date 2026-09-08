class Solution {
    public int maximumCount(int[] nums) {
        int posC=0;
        int negC=0;
        int i=0;
        while(i<nums.length && nums[i]<0){
            negC++;
            i++;
        }
        while(i<nums.length && nums[i]==0){
            i++;
        }
    
        while(i<nums.length && nums[i]>0){
            posC++;
            i++;
        }
        return Math.max(posC,negC);
    }
}