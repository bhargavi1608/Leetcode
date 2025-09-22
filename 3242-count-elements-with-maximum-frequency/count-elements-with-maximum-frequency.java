class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int freq=0,count=0;

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int val:map.values()){
            if(val==freq){
                count++;
            }else if(val>freq){
                freq=val;
                count=1;
            }

        }
        return freq*count;
        
        

    }
}