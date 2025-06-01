class Solution {
    public long distributeCandies(int n, int limit) {
        long count=0;
        for(int i=0;i<=limit;i++){
           long  j_min = Math.max(0,n-i-limit);
           long  j_max = Math.min(limit,n-i);
            if(j_max>=j_min){
                count+=(j_max-j_min+1);
            }
        }
        return count;
    }
}