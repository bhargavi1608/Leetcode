class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        ArrayList<String> list = new ArrayList<>();
        String[] sent1 = s1.split(" ");
        String[] sent2 = s2.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for(String  str1:sent1){
            map.put(str1,map.getOrDefault(str1,0)+1);
        }
        for(String str2:sent2){
            map.put(str2,map.getOrDefault(str2,0)+1);
        }
        for(Map.Entry<String,Integer> e:map.entrySet()){
            if(e.getValue()==1){
                list.add(e.getKey());
            }
        }
        String[] res = new String[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
}