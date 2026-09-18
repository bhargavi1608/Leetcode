class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token:tokens){
            if(isOperator(token)){
                int num2 = stack.pop();
                int num1 = stack.pop();
                int ans = cal(num1,num2,token);
                stack.push(ans);
            }else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
    public boolean isOperator(String token){
        return token.equals("+") || token.equals("-") || token.equals("/") || token.equals("*");
    }
    public int cal(int a,int b, String token){
        switch(token){
            case "+":
                return a+b;
                
            case "-":
                return a-b;
                
            case "*":
                return a*b;
                
            case "/":
                return a/b;
            default:
                return -1;
        }
    }
}