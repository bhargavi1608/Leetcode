class Solution {
    public String minWindow(String s, String t) {
        int[] need = new int[128];
        int required=0;
        for(int i=0;i<t.length();i++){
            if (need[t.charAt(i)] == 0) {
                required++;
            }
            need[t.charAt(i)]++;
        }
        int left=0;
        int right=0;
        int formed=0;
       
        int[] window = new int[128];
        int minLength = Integer.MAX_VALUE;
        int start = 0;
        for(right=0;right<s.length();right++){
            char c = s.charAt(right);
            window[c]++;
            if(need[c]>0 && window[c]==need[c]){
                formed++;
                
            }
            while(formed==required){
                 if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }
                char leftChar = s.charAt(left);
                window[leftChar]--;
                
                if(need[leftChar]>0 && window[leftChar]<need[leftChar]){
                    formed--;
                    
                }
            left++;
            }
            
        }
        if(minLength==Integer.MAX_VALUE){
            return "";
        }
       return s.substring(start,start+minLength);
    }
}