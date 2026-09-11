class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> charToword = new HashMap<>();
        HashMap<String,Character> wordToChar = new HashMap<>();
        String[] word = s.split(" ");
        if(pattern.length()!=word.length) return false;
        for(int i=0;i<pattern.length();i++){
            char key = pattern.charAt(i);
            String val = word[i];
            if(charToword.containsKey(key)){
                if(charToword.get(key).equals(val)==false){
                    return false;
                }
            }else{
               charToword.put(key,val);
            }
            if(wordToChar.containsKey(val)){
                if(wordToChar.get(val)!=key){
                    return false;
                }
            }else{
                wordToChar.put(val,key);
            }
        }
        return true;
    }
}