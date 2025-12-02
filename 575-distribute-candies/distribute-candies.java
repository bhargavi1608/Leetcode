class Solution {
    public int distributeCandies(int[] candyType) {
        int length = candyType.length/2;
        Set<Integer> set = new HashSet<>();
        for(int num:candyType){
            set.add(num);
        }
        if(set.size()==length){
            return set.size();
        }
        else if(set.size()<length){
            return set.size();
        }else{
            return length;
        }

    }
}