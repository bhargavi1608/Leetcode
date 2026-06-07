class Solution {
    public boolean isValid(String s) {
        List<Character> open =  Arrays.asList('(','{','[');
        List<Character> close =  Arrays.asList(')','}',']');
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            if(open.contains(c)){
                st.push(c);
            }else{
                if(st.isEmpty()){
                    return false;
                }else{
                    char top = st.pop();
                    if(c==')'&& top!='(' || c==']' && top!='[' || c=='}' && top!= '{'){
                        return false;
                    }
                }
                
            }
        }
        return st.isEmpty();
    }
}