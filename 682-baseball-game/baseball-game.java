class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();
        for(String str:operations){
            if(str.equals("+")){
                if (!s.isEmpty() && s.size()>=2){
                    int a = s.pop();
                    int b = s.pop();
                    s.push(b);
                    s.push(a);
                    s.push(a+b);
                }
            }else if(str.equals("C")){
                s.pop();
            }else if(str.equals("D")){
                int top = s.peek();
                s.push(top*2);
            }else{
                s.push(Integer.parseInt(str));
               
            }
        }
        int sum=0;
        for(int num:s){
            sum+=num;
        } 
        return sum;
    }
}