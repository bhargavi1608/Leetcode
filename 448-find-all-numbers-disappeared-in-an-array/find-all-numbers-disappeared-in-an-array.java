class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for(int i=0;i<nums.length;i++){
            if(!set.contains(i+1)){
                list.add(i+1);
            }
        }
        return list;
    }
}