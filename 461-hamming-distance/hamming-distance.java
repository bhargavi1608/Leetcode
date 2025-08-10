class Solution {
    public int hammingDistance(int x, int y) {
        String x1 = Integer.toBinaryString(x);
        String y1 = Integer.toBinaryString(y);
        int count=0;
        int maxlen=Math.max(x1.length(),y1.length());
        while(x1.length()<maxlen){
            x1="0"+x1;
        }
        while(y1.length()<maxlen){
            y1="0"+y1;
        }
        for(int i=0;i<maxlen;i++){
            if(x1.charAt(i)!=y1.charAt(i)){
                count++;
            }
        }
        return count;
    }
}