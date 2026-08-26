class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int left=0;
        int start=0;
        int minLen =Integer.MAX_VALUE;
        int count =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
            while(count==k){
                int currentLen = i-left+1;
                if (currentLen < minLen ||
                    (currentLen == minLen &&
                     s.substring(left, i + 1)
                      .compareTo(s.substring(start, start + minLen)) < 0)) {

                    minLen = currentLen;
                    start = left;
                }
                if(s.charAt(left)=='1'){
                    count--;
                }
               left++;

            }
        }
        if(minLen==Integer.MAX_VALUE){
            return "";
        }
       return s.substring(start,start+minLen);
    }
}