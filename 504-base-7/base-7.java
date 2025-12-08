class Solution {
    public String convertToBase7(int num) {
       if(num==0) return "0";
       StringBuilder sb =new StringBuilder();
       boolean isNeg = num<0;
       num = Math.abs(num);
       while(num>0){
        sb.append(num%7);
        num=num/7;
       }
       if(isNeg) sb.append("-");
       return sb.reverse().toString();

    }
}