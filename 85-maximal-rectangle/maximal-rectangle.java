class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int maxArea =0;
        int prefixSum[][]=new int[n][m];
        for(int j=0;j<m;j++){
            int sum=0;
            for(int i=0;i<n;i++){
                if (matrix[i][j] == '1') {
                    sum++;
                } else {
                    sum = 0;
                }
                prefixSum[i][j]=sum;
            }
        }
        for(int i=0;i<n;i++){
            maxArea = Math.max(maxArea,LHisto(prefixSum[i]));
        }
        return maxArea;
        
    }
    public int LHisto(int[] arr){
        Stack<Integer> s = new Stack<>();
        int maxArea =0;
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[i]<arr[s.peek()]){
                int height = arr[s.pop()];
                int width = (s.isEmpty())?i:i-s.peek()-1;
                maxArea = Math.max(maxArea,height*width);
            }
            s.push(i);
        }
        while(!s.isEmpty()){
            int height = arr[s.pop()];
            int width = (s.isEmpty()) ? arr.length: arr.length-s.peek()-1;
            maxArea=Math.max(maxArea,height*width);
        }
        return maxArea;
    }
}