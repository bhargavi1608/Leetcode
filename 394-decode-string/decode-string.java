class Solution {
    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> num = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        int k=0;
        String curr="";
        for(char c:s.toCharArray()){
           if(Character.isDigit(c)){
                k=k*10+(c-'0');
            }else if(c=='['){
                num.push(k);
                stringStack.push(curr);
                curr="";
                k=0;
            }else if(c==']'){
                int repeat = num.pop();
                String prev = stringStack.pop();
                String temp="";
                for(int i=0;i<repeat;i++){
                    temp+=curr;
                }
                curr=prev+temp;
            }
            else{
                curr+=c;
            }
            
        }
        return curr;
    }
}