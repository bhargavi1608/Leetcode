class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int i=0;
        String first=strs[0];
        String last= strs[strs.length-1];
        String res="";
        while(i<first.length() && i<last.length() && first.charAt(i)==last.charAt(i)){
            res+=first.charAt(i);
            i++;
        }
        return res;
    }
}