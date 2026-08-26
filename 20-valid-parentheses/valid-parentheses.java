class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        ArrayList<Character> l1 = new ArrayList<>(Arrays.asList('(','{','['));
        ArrayList<Character> l2 = new ArrayList<>(Arrays.asList(')','}',']'));
        for(char c:s.toCharArray()){
            if(l1.contains(c)){
                st.push(c);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                char top = st.pop();
                if(c==')' && top!='(' || c==']' && top!='[' || c=='}' && top!='{'){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}