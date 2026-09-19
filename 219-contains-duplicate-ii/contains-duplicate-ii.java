class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            Integer j = map.put(nums[i],i);
            if(j!=null && Math.abs(i-j)<=k){
                return true;
            }
        }
        return false;
    }
}