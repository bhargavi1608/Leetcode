class Solution {
    public int minimumRecolors(String blocks, int k) {
        int minW= Integer.MAX_VALUE;
        for(int i=0;i+k<=blocks.length();i++){
            String sub = blocks.substring(i,i+k);
            int count=0;
            for(char c:sub.toCharArray()){
                if(c=='W'){
                    count++;
                }
             
            }
            minW=Math.min(minW,count);
        }
        return minW;
    }
}