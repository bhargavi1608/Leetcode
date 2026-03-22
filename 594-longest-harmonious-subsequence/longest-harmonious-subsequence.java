class Solution {
    public int findLHS(int[] nums) {
     Map<Integer,Integer> map = new HashMap<>();
     for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);

     }  
     int len =0;
     int maxLen =0;
     for(int num:nums){
        if(map.containsKey(num+1)){
            len=map.get(num)+map.get(num+1);
            
        }
        maxLen=Math.max(maxLen,len);
     } 
     return maxLen;
    }
}