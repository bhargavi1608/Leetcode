class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String concat = s+s;
        String newstr = concat.substring(1,concat.length()-1);
        if(newstr.contains(s)){
            return true;
        }
        return false;
    }
}