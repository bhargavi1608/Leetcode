class Solution {
    public int numberOfBoomerangs(int[][] points) {
        
        int count=0;
        for(int i=0;i<points.length;i++){
            Map<Integer,Integer> map = new HashMap<>();
            for(int j=0;j<points.length;j++){
                if(i==j) continue;
                int x1 = points[i][0];
                int y1 = points[i][1];
                int x2 = points[j][0];
                int y2 = points[j][1];
                int dist = distance(x1,y1,x2,y2);
                map.put(dist,map.getOrDefault(dist,0)+1);
            }
            for(int val:map.values()){
                count+=val*(val-1);
            }
        }
        return count;
       
    }
    public int distance(int x1,int y1, int x2, int y2){
        int dx = (x2-x1)*(x2-x1);
        int dy = (y2-y1)*(y2-y1);
        return dx+dy;
    }
}