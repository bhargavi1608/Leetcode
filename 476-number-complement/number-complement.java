class Solution {
    public int findComplement(int num) {
        String num1 = Integer.toBinaryString(num);
        String flip="";
        for(int i=0;i<num1.length();i++){
            if(num1.charAt(i)=='1'){
                flip+="0";
            }else{
                flip+="1";
            }
        }
        int flip1 = Integer.parseInt(flip,2);
        return flip1;
    }
}