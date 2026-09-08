class Solution {
    public int maxFrequencyElements(int[] nums) {
       Map<Integer,Integer> map = new HashMap<>();
       for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);
       } 
       int count=0;
       int max = Collections.max(map.values());
       for(int val:map.values()){
        if(val==max){
            count+=val;
        }
       }
       return count;
    }
}