class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()) return false;
        int i=0,k=0;
        while(i<s.length() && k<t.length()){
            if(s.charAt(i)==t.charAt(k)){
                i++;
            }
            k++;
        }
        return i==s.length();
    }
}