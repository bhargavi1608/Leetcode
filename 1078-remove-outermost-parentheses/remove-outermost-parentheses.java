class Solution {
    public String removeOuterParentheses(String s) {
        int depth = 0;
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='('){
               if(depth>0){
                sb.append(c);
               }
               depth++;
            }else{
                depth--;
                if(depth>0){
                    sb.append(c);
                }
            }
            
        }
        return sb.toString();
    }
}