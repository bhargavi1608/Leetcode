class Solution {
    public int findClosest(int x, int y, int z) {
        int x_diff = Math.abs(z-x);
        int y_diff=Math.abs(z-y);
        if(x_diff<y_diff){
            return 1;
        }else if(y_diff<x_diff){
            return 2;
        }
        return 0;
    }
}