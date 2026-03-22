class Solution {
    public String customSortString(String order, String s) {
        ArrayList<Character> list = new ArrayList<>();
        for(char c:s.toCharArray()){
            list.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for(char c:order.toCharArray()){
            while(list.contains(c)){
                sb.append(c);
                list.remove(Character.valueOf(c));
            }
        }
        for(char c:list){
            sb.append(c);
        }
        return sb.toString();
    }
}