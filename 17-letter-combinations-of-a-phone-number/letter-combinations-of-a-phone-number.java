class Solution {
    private static final String[] digitsToLetters = {
        "", "", "abc", "def", "ghi", "jkl",
        "mno", "pqrs", "tuv", "wxyz"
    };
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0 || digits==null) return new ArrayList<>();
        ArrayList<String> ans = new ArrayList<>();
        backtrack(digits,0,new StringBuilder(),ans);
        return ans;
    }
    public void backtrack(String digits,int idx,StringBuilder sb, List<String> ans){
        if(idx==digits.length()){
            ans.add(sb.toString());
            return;
        }
        for(final char c:digitsToLetters[digits.charAt(idx)-'0'].toCharArray()){
            sb.append(c);
            backtrack(digits,idx+1,sb,ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}