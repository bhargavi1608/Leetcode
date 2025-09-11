class Solution {
    public String sortVowels(String s) {
       StringBuilder vowels = new StringBuilder();
       for(char c:s.toCharArray()){
        if("AEIOUaeiou".indexOf(c)!=-1){
            vowels.append(c);
        }

       }
       char[] vowelsArr = vowels.toString().toCharArray();
       Arrays.sort(vowelsArr);
       StringBuilder result = new StringBuilder();
       int vowelIndex=0;
       for(char c:s.toCharArray()){
        if("AEIOUaeiou".indexOf(c)!=-1){
            result.append(vowelsArr[vowelIndex++]);
        }else{
            result.append(c);
        }
       }
       return result.toString();
    }
}