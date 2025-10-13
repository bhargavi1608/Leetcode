class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry =0;
        int i=a.length()-1; //i=1;
        int j = b.length()-1; // j=0

        while(i>=0 || j>=0 || carry==1){
            if(i>=0) 
                carry+=a.charAt(i--)-'0'; // 49 - 48 = 1carry =1
            if(j>=0)
                carry+=b.charAt(j--)-'0';// 49-48 =1 carry = 1+1 =2
            sb.append(carry%2);//sb ="0"
            carry = carry/2; // carry =1;
        }
        return sb.reverse().toString();
    }
}