class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp =arr.clone();
        Arrays.sort(temp);
        HashMap<Integer,Integer> map = new HashMap<>();
        int rank=1;
        for(int num:temp){
            if(!map.containsKey(num)){
                map.put(num,rank);
                rank++;
            }
        }
        int[] res = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[i]=map.get(arr[i]);
        }
        return res;
    }
}