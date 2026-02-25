class Solution {
    public boolean isIsomorphic(String s, String t) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for(char c:s.toCharArray()){
            l1.add(s.indexOf(c));
        }
        for(char c:t.toCharArray()){
            l2.add(t.indexOf(c));
        }
        return l1.equals(l2);
    }
}