class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String word:strs){
            char[] c = word.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            if(map.containsKey(key)){
                map.get(key).add(word);
            }else{
                ArrayList<String> list = new ArrayList<>();
                list.add(word);
                map.put(key,list);
            }
        }
        return new ArrayList<>(map.values());
    }
}