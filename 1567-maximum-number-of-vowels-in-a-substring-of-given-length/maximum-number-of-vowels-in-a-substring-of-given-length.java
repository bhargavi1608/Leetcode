class Solution {
    public int maxVowels(String s, int k) {
        int vowelCount=0;
        int maxVowel=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                vowelCount++;
            }
          
        }
        maxVowel = vowelCount;
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i-k))){
                vowelCount--;
            }
            if(isVowel(s.charAt(i))){
                vowelCount++;
            }
            maxVowel = Math.max(maxVowel,vowelCount);
        }
        return maxVowel;
    }
    public boolean isVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}