class Solution {
    public boolean isPowerOfFour(int n) {
        double logValue = Math.log(n)/Math.log(4);
        return logValue==(int)logValue; 

    }
}