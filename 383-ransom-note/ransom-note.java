class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map = new HashMap<>();
        char[] rN = ransomNote.toCharArray();
        char[] m = magazine.toCharArray();
        for(char c:m){
            map.put(c,map.getOrDefault(c,0)+1);

        }
        for(char c:rN){
            if(!map.containsKey(c)){
                return false;
            }else if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
                if(map.get(c)==0){
                    map.remove(c);
                }
            }
            
            
        }
        return true;

    }
}