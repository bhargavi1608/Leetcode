class Solution {
    public boolean checkOnesSegment(String s) {
        if(s.length()==1){
            return true;
        }
        int count=0;
        for(int i=1;i<s.length();i++){
           if(s.charAt(i-1)=='1' && s.charAt(i)=='0' || s.charAt(i-1)=='0' && s.charAt(i)=='1'){
            count++;
           }
           if(count>1){
            return false;
           }
        }
        return count<=1;
    }
}