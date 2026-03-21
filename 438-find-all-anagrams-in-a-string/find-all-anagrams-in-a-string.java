class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(s.length() < p.length()) return new ArrayList<>();
        int[] sArray = new int[26];
        int[] pArray = new int[26];
        List<Integer> res = new ArrayList<>();
        for(char i:p.toCharArray()){
            pArray[i-'a']++;
        }
        int k = p.length();
        for(int i=0;i<k;i++){
            sArray[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(sArray,pArray)){
            res.add(0);
        }
        for(int i=k;i<s.length();i++){
            sArray[s.charAt(i)-'a']++;
            sArray[s.charAt(i-k)-'a']--;
            if(Arrays.equals(sArray,pArray)){
                res.add(i-k+1);
            }
        }
        return res;
        
    }
}