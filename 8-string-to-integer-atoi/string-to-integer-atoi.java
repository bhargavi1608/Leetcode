class Solution {
    public int myAtoi(String s) {
        int i=0;
        int len=s.length();
        // remove trailing spaces
        while(i<len && s.charAt(i)==' '){
            i++;
        }
        if(i==len) return 0;
        // handles sign
        int sign =1;
        if(s.charAt(i)=='+' || s.charAt(i)=='-'){
            if(s.charAt(i)=='-'){
               sign =-1;
            }
            i++;
        }

        // conversion to int with overflow check

        int res =0;
        while(i<len && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i)-'0';
            if(res> Integer.MAX_VALUE/10 || res==Integer.MAX_VALUE/10 && digit>7){
                return sign==1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = res*10+digit;
            i++;
        }
        
        return sign*res;

    }
}