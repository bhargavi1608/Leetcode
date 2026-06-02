class Solution {
    public int expressiveWords(String s, String[] words) {
        int count=0;
        for(String word:words){
            if(isStrechy(s,word)){
                count++;
            }
        }
        return count;
    }
    private boolean isStrechy(String s, String word){
        int i=0,j=0;
        while(i<s.length() && j<word.length()){
            if(s.charAt(i)!=word.charAt(j)){
                return false;
            }
            char ch = s.charAt(i);
            int countS=0;
            while(i<s.length() && s.charAt(i)==ch){
                countS++;
                i++;
            }
            int countW=0;
            while(j<word.length() && word.charAt(j)==ch){
                countW++;
                j++;
            }
            if(countS < countW){
                return false;
            }
            if(countS!=countW && countS<3){
                return false;
            }
        }
        return i==s.length() && j==word.length();
        
    }
}