class Solution {
    public int minimumCost(int[] nums) {
        int[] res = new int[nums.length-1];
        int idx =0;
        for(int i=1;i<nums.length;i++){
            res[idx]=nums[i];
            idx++;
        }
        Arrays.sort(res);
        return nums[0]+res[0]+res[1];
    }
}