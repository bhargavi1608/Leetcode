class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> res = new ArrayList<>();
        int[] lastOcc = new int[26];
        for(int i=0;i<s.length();i++){
            lastOcc[s.charAt(i)-'a']=i;
        }
        int end = lastOcc[s.charAt(0)-'a'];
        int start=0;
        while(start<s.length()){
            for(int i=start;i<=end;i++){
                int last = lastOcc[s.charAt(i)-'a'];
                end=Math.max(end,last);
               
            }
            res.add(end-start+1);
            start=end+1;
            if(start==s.length()){
                return res;
            }
            end=lastOcc[s.charAt(start)-'a'];
            
        }
        return res;
    }
}