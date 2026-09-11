class Solution {
    public List<String> commonChars(String[] words) {
        List<String> res = new ArrayList<>();
        int[] common = new int[26];
        for(char c:words[0].toCharArray()){
            common[c-'a']++;
        }
        for(int i=1;i<words.length;i++){
            int[] freq = new int[26];
            for(char c:words[i].toCharArray()){
                freq[c-'a']++;
            }
            for(int j=0;j<26;j++){
                common[j]=Math.min(common[j],freq[j]);
            }
        }
        for(int i=0;i<26;i++){
            while(common[i]>0){
                res.add(String.valueOf((char)(i+'a')));
                common[i]--;
            }
        }
        return res;
    }
}