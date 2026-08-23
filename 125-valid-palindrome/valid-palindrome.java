class Solution {
    public boolean isPalindrome(String s) {
        
        s=s.toLowerCase();
       
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
                if(Character.isLetterOrDigit(s.charAt(i))){
                    res.append(s.charAt(i));
                }
            }
            String original = res.toString();
            return original.equals(res.reverse().toString());
    }
}