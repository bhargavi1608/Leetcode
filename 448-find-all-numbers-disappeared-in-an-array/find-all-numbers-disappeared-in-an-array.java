class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> list = new HashSet<>();
        for(int num:nums){
            list.add(num);
        }
        List<Integer> res = new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!list.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}