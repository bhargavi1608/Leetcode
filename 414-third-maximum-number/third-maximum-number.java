class Solution {
    public int thirdMax(int[] nums) {
        
        HashSet<Integer> s1 = new HashSet<>();
        for(int num:nums){
            s1.add(num);
        }

        List<Integer> list = new ArrayList<>(s1);
        Collections.sort(list,Collections.reverseOrder());
        if(list.size()>=3){
            return list.get(2);
        }else{
            return list.get(0);
        }
        

    }
}