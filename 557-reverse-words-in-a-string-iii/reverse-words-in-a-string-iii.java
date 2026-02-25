class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] parts = s.split("\\s+");
        for(int i=0;i<parts.length;i++){
           StringBuilder word = new StringBuilder(parts[i]).reverse();
           sb.append(word).append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
    
}