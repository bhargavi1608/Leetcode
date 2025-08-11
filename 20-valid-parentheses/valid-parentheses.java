class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        List<Character> openlist = Arrays.asList('(','[','{');
        List<Character> closelist = Arrays.asList(')',']','}');
        for(char ch : s.toCharArray()){
            if(openlist.contains(ch)){
                stack.push(ch);
            }else if(closelist.contains(ch)){
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if(openlist.indexOf(top)!=closelist.indexOf(ch)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}