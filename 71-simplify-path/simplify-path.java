class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] arr = path.split("/");
        for(String s : arr){
            if (s.equals("") || s.equals(".")) {
                continue;
            }
            if(s.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
              
            }
            else{
                stack.push(s);
            }
          
            
        }
        StringBuilder sb = new StringBuilder();
        
      for (String s : stack) {
        sb.append("/").append(s);
      }
        return sb.length()==0 ? "/":sb.toString();
    }
}