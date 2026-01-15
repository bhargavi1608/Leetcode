class Solution {
    public boolean satisfiesConditions(int[][] grid) {
        int rows=grid.length;
        int col = grid[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
               if(i+1<rows && grid[i][j]!=grid[i+1][j]){
                return false;
               }
               if(j+1<col && grid[i][j]==grid[i][j+1]){
                return false;
               }
            }
        }
        return true;
    }
}