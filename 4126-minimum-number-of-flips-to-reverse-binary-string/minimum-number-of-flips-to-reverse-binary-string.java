class Solution {
    public int minimumFlips(int n) {
        String s = Integer.toBinaryString(n);
        String rev = new StringBuilder(s).reverse().toString();
        int count=0;
        int left =0;
       
        while(left<s.length()){
            if(s.charAt(left)!=rev.charAt(left)){
                count++;
            }
            left++;
        }
        return count;
    }
}