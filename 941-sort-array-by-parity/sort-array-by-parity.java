class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> even = new ArrayList<>();
         ArrayList<Integer> odd = new ArrayList<>();
         for(int num:nums){
            if(num%2==0){
                even.add(num);
            }else{
                odd.add(num);
            }
         }
         int[] res = new int[nums.length];
         int idx=0;
         for(int e:even){
            res[idx++]=e;
         }
         for(int o:odd){
            res[idx++]=o;
         }
         return res;
    }
}