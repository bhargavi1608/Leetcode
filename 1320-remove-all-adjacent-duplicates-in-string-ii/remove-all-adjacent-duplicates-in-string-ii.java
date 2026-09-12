class Solution {
    public String removeDuplicates(String s, int k) {
        
        Stack<int[]> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if(!stack.isEmpty() && stack.peek()[0]==c){
                stack.peek()[1]++;
                if(stack.peek()[1]==k){
                    stack.pop();
                }
            }else{
                stack.push(new int[]{c,1});
            }
            
        }
        StringBuilder sb = new StringBuilder();
        for(int[] pair:stack){
            char c = (char) pair[0];
            int count = pair[1];
            for(int i=0;i<count;i++){
                sb.append(c);
            }

        }
        return sb.toString();
    }
}