class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] res = new int[nums.length];
        ArrayList<Integer> smaller = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();
        ArrayList<Integer> larger = new ArrayList<>();
        for(int num:nums){
            if(num<pivot){
                smaller.add(num);
            }else if(num==pivot){
                equal.add(num);
            }else{
                larger.add(num);
            }
        }
        int idx=0;
        for(int num:smaller){
            res[idx++]=num;
        }
        for(int num:equal){
            res[idx++]=num;
        }
        for(int num:larger){
            res[idx++]=num;
        }
        
        return res;
    }
}