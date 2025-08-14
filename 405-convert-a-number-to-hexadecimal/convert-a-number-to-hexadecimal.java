class Solution {
    public String toHex(int num) {
        // return Integer.toHexString(num);
        char[] arr = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        if(num==0) return "0";
        StringBuilder sb = new StringBuilder();
        long unsign = num&0xFFFFFFFFL;
        while(unsign>0){
            int digit = (int)(unsign%16);
            sb.append(arr[digit]);
            unsign/=16;
        }
        return sb.reverse().toString();
    }
}