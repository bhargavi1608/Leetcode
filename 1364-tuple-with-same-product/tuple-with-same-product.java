class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
               
                int p = nums[i]*nums[j];
                map.put(p,map.getOrDefault(p,0)+1);
            }
        }
        int total =0;
       
        for(int val:map.values()){
            total += val*(val-1)*4;
           
        }
        return total;
    }
}