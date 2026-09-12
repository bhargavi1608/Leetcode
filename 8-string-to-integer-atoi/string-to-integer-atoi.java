class Solution {
    public int myAtoi(String s) {
      
        String res ="";
        s=s.trim();
        if(s.length()==0) return 0;
        int sign =1;
        int i=0;

        // Hamndle sign
        if(s.charAt(i)=='-'){
            sign = -1;
            i++;
        }else if(s.charAt(i)=='+'){
            i++;
        }
        int num=0;
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i)-'0';
            if(num>Integer.MAX_VALUE/10 || num==Integer.MAX_VALUE/10 && digit>7){
                return (sign==1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num=num*10+digit;
            i++;
        }
        return num*sign;
    }
}