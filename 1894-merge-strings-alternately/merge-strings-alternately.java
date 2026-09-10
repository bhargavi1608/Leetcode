class Solution {
    public String mergeAlternately(String word1, String word2) {
      StringBuilder res = new StringBuilder();
        int i=0;
        int j=0;
        
        while(i<word1.length() && j<word2.length()){
            res.append(word1.charAt(i));
            res.append(word2.charAt(j));
            i++;
            j++;
        }
        while(i<word1.length()){
            res.append(word1.charAt(i));
            i++;
        }
        while(j<word2.length()){
            res.append(word2.charAt(j));
            j++;
        }
        return res.toString();
    }
}