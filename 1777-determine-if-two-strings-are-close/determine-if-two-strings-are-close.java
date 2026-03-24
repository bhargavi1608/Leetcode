class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()) return false;
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        for(char c:word1.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        for(char c:word2.toCharArray()){
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        if(!map1.keySet().equals(map2.keySet())) return false;
        int[] arr1 = new int[map1.size()];
        int[] arr2 = new int[map2.size()];
        int i = 0;
        for (int val : map1.values()) {
            arr1[i++] = val;
        }
        i=0;
        for (int val : map2.values()) {
            arr2[i++] = val;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
}