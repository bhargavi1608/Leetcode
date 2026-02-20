class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       ArrayList<Integer> list = new ArrayList<>();
       Map<Integer,Integer> map = new HashMap<>();
       for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);
       }
       for(Map.Entry<Integer,Integer> e:map.entrySet()){
        if(e.getValue()>1){
            list.add(e.getKey());
        }
       }
       return list;
    }
}