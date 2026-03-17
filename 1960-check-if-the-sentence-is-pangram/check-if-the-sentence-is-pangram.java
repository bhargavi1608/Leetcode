class Solution {
    public boolean checkIfPangram(String sentence) {
        sentence = sentence.toLowerCase();
        Set<Character> set = new HashSet<>();
        for(char c:sentence.toCharArray()){
            if(c>='a' && c<='z'){
                set.add(c);
            }
        }
        return set.size()==26;

    }
}