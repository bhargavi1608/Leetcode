class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
       
        Arrays.sort(arr);
        int min_Diff = Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            min_Diff = Math.min(min_Diff,arr[i]-arr[i-1]);
        }
      
     
        List<List<Integer>> res = new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==min_Diff){
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i-1]);
                pair.add(arr[i]);
                res.add(pair);
            }
        }
        return res;
    }
}