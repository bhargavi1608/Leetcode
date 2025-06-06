class Solution {
    public String robotWithString(String s) {
       int n = s.length();
       char[] arr = s.toCharArray();
       char[] suffixMin = new char[n];
       suffixMin[n-1]=arr[n-1];
       for(int i=n-2;i>=0;i--){
        suffixMin[i]=(char) Math.min(arr[i],suffixMin[i+1]);
       }
       Deque<Character> t = new ArrayDeque<>();
       StringBuilder p = new StringBuilder();
       int i=0;
       while(i<n){
        t.push(arr[i]);
        i++;
        while(!t.isEmpty() && (i==n||t.peek()<=suffixMin[i])){
            p.append(t.pop());
        }

       }
        while (!t.isEmpty()) {
            p.append(t.pop());
        }
        return p.toString();
    }
 
}