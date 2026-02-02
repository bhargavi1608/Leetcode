class Solution {
    public void duplicateZeros(int[] arr) {
       ArrayList<Integer> res = new ArrayList<>();
        int i=0;
        int j=0;
        while(res.size()<arr.length){
           res.add(arr[i]);
           if(arr[i]==0){
            res.add(0);
            j++;
           }
           i++;
        }
        for(int k=0;k<arr.length;k++){
            arr[k]=res.get(k);
        }
    }
}