class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;

        for(int[] ar:accounts){
           int sum=0;
            for(int el:ar){
                 
                 sum+=el;
            }
           max = Integer.max(max,sum);
        }
        return max;
    }
}