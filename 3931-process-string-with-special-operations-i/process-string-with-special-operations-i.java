class Solution {
    public String processStr(String s) {
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='*'){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else if(c=='#'){
                List<Character> list = new ArrayList<>(st);
                for(char ch:list){
                    st.push(ch);
                }
            }else if(c=='%'){
                Stack<Character> rev = new Stack<>();
                while(!st.isEmpty()){
                    rev.push(st.pop());
                }
                st=rev;
            }else{
                st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c:st){
            sb.append(c);
        }
        return sb.toString();
    }
}