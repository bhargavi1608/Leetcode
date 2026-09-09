class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            l1.add(s.indexOf(s.charAt(i)));
        }
        for(int i=0;i<t.length();i++){
            l2.add(t.indexOf(t.charAt(i)));
        }
        return  l1.equals(l2);

    }
}