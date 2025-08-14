class Solution {
    public int subarraysDivByK(int[] nums, int k) {
       Map<Integer,Integer> map = new HashMap<>();
       map.put(0,1);
       int presum=0;
       int count=0;
       for(int num:nums){
        presum+=num;
        int mod=presum%k;
        if(mod<0) mod+=k;
        if(map.containsKey(mod)){
            
            count+=map.get(mod);
            

        } 
        map.put(mod,map.getOrDefault(mod,0)+1);
       }
       return count;
    }
}