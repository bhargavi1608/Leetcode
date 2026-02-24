class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1) return intervals;
        List<int[]> result = new ArrayList<>();
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
       
        int[] interval = intervals[0];
        result.add(interval);
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=interval[1]){
                interval[1]=Math.max(intervals[i][1],interval[1]);
            }else{
                interval = intervals[i];
                result.add(interval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}