class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int[] res = new int[queries.length];
        int count=0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x){
                count++;
                list.add(i);
            }
        }
        
        for(int i=0;i<queries.length;i++){
            if(queries[i]<=count){
                res[i]=list.get(queries[i]-1);
                
            }else{
                res[i]=-1;
            }
        }
        return res;

    }
}