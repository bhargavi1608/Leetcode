class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        Set<Integer> set = new HashSet<>();
        for(int val:map.values()){
            if(!set.add(val)){
                return false;
            }
        }
        return true;
    }
}