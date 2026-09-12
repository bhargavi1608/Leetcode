class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        int i=0;
        String res="";
        while(i<first.length() && i<last.length() && first.charAt(i)==last.charAt(i)){
            
            res+=first.charAt(i);
            i++;
        }
        return res;
    }
}