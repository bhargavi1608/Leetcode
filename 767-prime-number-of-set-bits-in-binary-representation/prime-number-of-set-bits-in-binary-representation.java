class Solution {
    public int countPrimeSetBits(int left, int right) {
        int ans =0;
        final int mask =665772;
        for(int i=left;i<=right;i++){
            if((mask >> Integer.bitCount(i) &1)==1){
                ++ans;
            }
        }
        return ans;
    }
}