class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int f = nums.length/2;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()==f){
                return e.getKey();
            }
        }
        return -1;

    }
}