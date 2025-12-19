class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token:tokens){
            if(isOperator(token)){
                int num2 = stack.pop();
                int num1 = stack.pop();
                int result = performOperation(num1,num2,token);
                stack.push(result);

            }
            else{
                stack.push(Integer.parseInt(token));
            }
        }
    
        return stack.pop();
    }
        private static boolean isOperator(String token){
            return "+-*/".contains(token);
        }

        private  static int performOperation(int a,int b,String operator){
            switch(operator){

            case "+": return a+b;
            case "-" : return a-b;
            case "*" :return a*b;
            case "/" : return a/b;
            default : throw new IllegalArgumentException("Invalid");

            }
        
    }
}