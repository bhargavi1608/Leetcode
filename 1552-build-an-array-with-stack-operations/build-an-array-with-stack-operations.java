class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<>();
        int idx=0;
        for(int i=1;i<=n;i++){
            
            if(i==target[idx]){
                res.add("Push");
                idx++;
            }else{
                res.add("Push");
                res.add("Pop");
            }
            if(idx==target.length){
                break;
            }
        }
        return res;
    }
}