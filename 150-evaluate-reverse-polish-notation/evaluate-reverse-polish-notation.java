class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(String token:tokens){
            if(isOperator(token)){
                int num2 = s.pop();
                int num1 = s.pop();
                int result = Cal(num1,num2,token);
                s.push(result);
            }else{
                s.push(Integer.parseInt(token));
            }
        }
        return s.pop();

    }
    public static boolean isOperator(String token){
        return "-+=/%*".contains(token);
    }
    public int Cal(int a,int b,String operator){
        switch(operator){
            case "+": return a+b;
            case "-": return a-b;
            case "*": return a*b;
            case "/": return a/b;
            default:
            throw new IllegalArgumentException("Invalid");
        }
    }
}