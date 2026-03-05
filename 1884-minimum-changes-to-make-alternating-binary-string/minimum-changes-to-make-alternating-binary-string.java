class Solution {
    public int minOperations(String s) {
       int alt1 =0;
       int alt2 =0;
       for(int i=0;i<s.length();i++){
            if(i%2==0){
                if(s.charAt(i)!='0') alt1++;
                if(s.charAt(i)!='1') alt2++;
            }else{
                if(s.charAt(i)!='1') alt1++;
                if(s.charAt(i)!='0') alt2++;
            }
       } 
       return Math.min(alt1,alt2);
    }
}