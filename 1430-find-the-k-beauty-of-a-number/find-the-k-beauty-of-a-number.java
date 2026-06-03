class Solution {
    public int divisorSubstrings(int num, int k) {
       int count=0;
       String s = String.valueOf(num);
       
       for(int i=0;i+k<=s.length();i++){
          String res= s.substring(i,i+k);
          int numres = Integer.parseInt(res);
          if(numres!=0 && num%numres==0) count++;
          
       } 
       return count;
        
    }
}