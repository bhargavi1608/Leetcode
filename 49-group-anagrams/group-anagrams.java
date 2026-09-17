class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String word:strs){
            char[] c = word.toCharArray();
            Arrays.sort(c);
            String cw = new String(c);
            if(!map.containsKey(cw)){
                map.put(cw,new ArrayList<>());
            }
            map.get(cw).add(word);
        }
        List<List<String>> res = new ArrayList<>();
        for(List val:map.values()){
            res.add(val);
        }
        return res;
    }
}