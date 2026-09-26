class Solution {
    public int[] countOfPairs(int n, int x, int y) {
        int[] res = new int[n];
     
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i == j) continue;
                int normal = Math.abs(i - j);
                int viaXY = Math.abs(i-x)+1+Math.abs(j-y);
                int viaYX = Math.abs(i-y)+1+Math.abs(j-x);
                int distance = Math.min(normal,Math.min(viaXY,viaYX));
                res[distance-1]++;
            }
        }
        return res;
    }
}