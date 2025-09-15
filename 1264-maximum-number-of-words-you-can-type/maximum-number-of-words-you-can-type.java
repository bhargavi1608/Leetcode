class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] arr = text.split(" ");
        int count=arr.length;
        ArrayList<Character> brr = new ArrayList<>();
        for (char c : brokenLetters.toCharArray()) {
            brr.add(c);
        }

        for(String str:arr){
            for(char c:str.toCharArray()){
                if(brr.contains(c)){
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}