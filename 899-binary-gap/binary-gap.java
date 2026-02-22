class Solution {
    public int binaryGap(int n) {
        String bin = Integer.toBinaryString(n);
        int count=0;
        int maxCount=0;
        int first1=-1;
        int second1=-1;
        for(int i=0;i<bin.length();i++){
            if(bin.charAt(i)=='1'){
                if(first1==-1){
                    first1=i;
                }else{
                    second1=i;
                }
            }
            if(first1!=-1 && second1!=-1){
                count=Math.abs(first1-second1);
                maxCount = Math.max(count,maxCount);
                first1=second1;
                second1=-1;
            }

        }
        return maxCount;
    }
}