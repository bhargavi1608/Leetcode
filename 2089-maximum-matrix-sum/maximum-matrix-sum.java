class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int min_num = Integer.MAX_VALUE;
        int negCount=0;
        long sum =0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<0){
                    negCount++;
                    
                }
                int absValue = Math.abs(matrix[i][j]);
                sum+=absValue;
                if(absValue<min_num){
                    min_num=absValue;
                }
                
            }
        }
        if(negCount%2==0){
            return sum;
        }
        return sum-2*(min_num);
    }
}