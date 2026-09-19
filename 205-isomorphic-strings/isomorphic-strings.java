class Solution {
    public boolean isIsomorphic(String s, String t) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(char c:s.toCharArray()){
            list1.add(s.indexOf(c));
        }
         for(char c:t.toCharArray()){
            list2.add(t.indexOf(c));
        }
        return list1.equals(list2);
    }
}