class Solution {
    public int[] sortedSquares(int[] nums) {
        ArrayList<Integer> sq = new ArrayList<>();
        for(int num:nums){
            sq.add(num*num);
        }
        Collections.sort(sq);
        int[] arr = new int[sq.size()];
        for(int i=0;i<sq.size();i++){
            arr[i]=sq.get(i);
        }
        return arr;
    }
}