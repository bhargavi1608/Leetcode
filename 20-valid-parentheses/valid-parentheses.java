class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack = new Stack<>();
        ArrayList<Character> open = new ArrayList<>(Arrays.asList('[','{','('));
       
        for(char c:s.toCharArray()){
            if(open.contains(c)){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    char top = stack.pop();
                    if(c==')' && top!='(' || c==']'&& top!='[' || c=='}' && top!='{'){
                        return false;
                    }
                }
            }

        }
        return stack.isEmpty();

    }
}