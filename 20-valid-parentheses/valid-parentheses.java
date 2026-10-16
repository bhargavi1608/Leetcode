class Solution {
    public boolean isValid(String s) {
        Stack<Character> st= new Stack<>();
        List<Character> opening = Arrays.asList('(','{','[');
        for(char c:s.toCharArray()){
            if(opening.contains(c)){
                st.push(c);
            }else{
                if(st.isEmpty()){
                    return false;
                }else{
                    char top = st.pop();
                    if(c==')'&&top!='(' || c==']'&&top!='['|| c=='}'&&top!='{' ){
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
        
    }
}