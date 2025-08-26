class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        
        int maxsqrt=0;
        int[] digonalLen = new int[dimensions.length];
        for(int i=0;i<dimensions.length;i++){
            digonalLen[i] = dimensions[i][0]*dimensions[i][0]+dimensions[i][1]*dimensions[i][1];
            
        }
        int idx=0;
        int max=Integer.MIN_VALUE;
        int maxarea=Integer.MIN_VALUE;
        for(int i=0;i<digonalLen.length;i++){
            int area = dimensions[i][0]*dimensions[i][1];
            if(digonalLen[i]>max || digonalLen[i]==max && area>maxarea){
                max=digonalLen[i];
                maxarea=area;
                 idx=i;
            }
           
        }
        return dimensions[idx][0]*dimensions[idx][1];
    }
}