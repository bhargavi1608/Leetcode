class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        List<String> list = new ArrayList<>();
        for(String word:words){
            String lower = word.toLowerCase();
            String row = null;
            if(row1.indexOf(lower.charAt(0))!=-1){
                row=row1;
            }
            else if(row2.indexOf(lower.charAt(0))!=-1){
                row=row2;
            }else{
                row=row3;
            }
            boolean sameRow = true;
            for(char c:word.toLowerCase().toCharArray()){
                if(row.indexOf(c)==-1){
                    sameRow=false;
                    break;
                }
            }
            if(sameRow) list.add(word);

        }
        return list.toArray(new String[0]);
    }
}