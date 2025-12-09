class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
       
        String[] parts = s.split(" ");
        for(int i=0;i<parts.length;i++){
           StringBuilder words = new StringBuilder(parts[i]).reverse();
           
           sb.append(words).append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}