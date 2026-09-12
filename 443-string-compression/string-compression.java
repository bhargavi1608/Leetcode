class Solution {
    public int compress(char[] chars) {
        int i=0;
        int write =0;
        while(i<chars.length){
            char curr = chars[i];
            int count=0;
            while(i<chars.length && chars[i]==curr){
                i++;
                count++;
            }
            chars[write++]=curr;
            if(count>1){
                String num = String.valueOf(count);
                for(char ch:num.toCharArray()){
                    chars[write++]=ch;
                }
            }
        }
        return write;
    }
}