class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for(int row=triangle.size()-2;row>=0;row--){
            for(int col=0;col<=row;col++){
                int curr = triangle.get(row).get(col);
                int below = triangle.get(row+1).get(col);
                int belowRight = triangle.get(row+1).get(col+1);
                triangle.get(row).set(col,curr+Math.min(below,belowRight));
            }
        }
        return triangle.get(0).get(0);
    
    }
}