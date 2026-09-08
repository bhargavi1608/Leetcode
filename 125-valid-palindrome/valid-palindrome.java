class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder res = new StringBuilder();
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                res.append(s.charAt(i));
            }
        }
        String original = res.toString();
        return original.equals(res.reverse().toString());
    }
}