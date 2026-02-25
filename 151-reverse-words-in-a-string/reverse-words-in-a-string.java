class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        StringBuilder sb = new StringBuilder();
        String[] parts = s.split("\\s+");
        for(int i=parts.length-1;i>=0;i--){
            sb.append(parts[i]);
            if(i!=0){
                sb.append(" ");
            }
        }
       
        return sb.toString();
    }
}