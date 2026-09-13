class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> stack = new Stack<>();
        for(char c:num.toCharArray()){
            while(!stack.isEmpty() && k>0 && stack.peek()>c-'0'){
                stack.pop();
                k--;
            }
            stack.push(c-'0');
        }
        while(k>0){
            stack.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();

        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        sb.reverse();
        int i=0;
        while(i<sb.length() && sb.charAt(i)=='0'){
            i++;
        }
        String res = sb.substring(i);
        return res.isEmpty() ? "0" : res;
    }
}