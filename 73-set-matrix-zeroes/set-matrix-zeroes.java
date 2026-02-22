class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rowset = new HashSet<>();
        Set<Integer> colset = new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    rowset.add(i);
                    colset.add(j);
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(rowset.contains(i) || colset.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }
    }
}