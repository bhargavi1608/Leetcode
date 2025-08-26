class Solution {
    public boolean repeatedSubstringPattern(String s) {
      String concat = s+s;
      String newStr = concat.substring(1,concat.length()-1);
      if(newStr.contains(s)){
        return true;
      }
      return false;
    }
}