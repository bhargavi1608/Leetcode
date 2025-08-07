class Solution {
    public boolean isPalindrome(String s) {
       s = s.replaceAll("[^a-zA-Z0-9]", "");
        
        int left=0;
        int right=s.length()-1;
        s=s.toLowerCase();
        
        while(left<=right && left<s.length() && right>=0){
                if(s.charAt(left)!=s.charAt(right)){
                    return false;
                    
                }
                left++;
                right--;
        }
        return true;
        // String rev=s;
        // rev.toLowerCase();
        // while(left<=right){
        //     char temp=rev.charAt(left);
        //     rev.charAt(left)=rev.charAt(right);
        //     rev.charAt(right)=temp;
        //     left++;
        //     right--;
        // }
    //     if(s.equals(rev)){
    //         return true;
    //     }
    // return false;
    }
}