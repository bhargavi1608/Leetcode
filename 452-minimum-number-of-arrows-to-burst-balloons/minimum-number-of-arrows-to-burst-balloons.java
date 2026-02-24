class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b) -> Integer.compare(a[1],b[1]));
        int prev = points[0][1];
        int count =0;
        for(int i=1;i<points.length;i++){
            if(points[i][0]<=prev && points[i][1]>=prev){
                count++;
            }else{
                prev = points[i][1];
            }
        }
        return points.length-count;
    }
}