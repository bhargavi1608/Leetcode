class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        ArrayList<StringBuilder> rows = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            rows.add(new StringBuilder());
        }
        int cr=0;
        boolean goingdown =false;
        for(int i=0;i<s.length();i++){
            rows.get(cr).append(s.charAt(i));
            if(cr==0 || cr==rows.size()-1){
                goingdown=!goingdown;
            }
            if(goingdown){
                cr++;
            }else{
                cr--;
            }
        }
        String ans="";
        for(int i=0;i<rows.size();i++){
            ans+=rows.get(i).toString();
        }
        return ans;
    }
}