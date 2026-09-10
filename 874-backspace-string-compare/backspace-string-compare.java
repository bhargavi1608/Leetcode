class Solution {
    public boolean backspaceCompare(String s, String t) {
     
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='#'){
               if(!s1.isEmpty()){
                s1.pop();
               }
            }
            if(c!='#'){
                s1.push(c);
            }
        }
        for(char c:t.toCharArray()){
            if(c=='#'){
                if(!s2.isEmpty()){
                    s2.pop();
                }
            }
            if(c!='#'){
                s2.push(c);
            }
        }

        String res1="";
        String res2="";
        while(!s1.isEmpty()){
            res1+=s1.pop();
        }
        while(!s2.isEmpty()){
            res2+=s2.pop();
        }
        return res1.equals(res2);    }
}