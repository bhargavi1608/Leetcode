class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int len =0;
        
        int[] nums = new int[s.length()];
        for(int i=0;i<s.length();i++){
            nums[i]=Math.abs(s.charAt(i)-t.charAt(i));
        }
        int left=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
           sum+=nums[i];
           while(sum>maxCost){
            sum-=nums[left];
            left++;
           }
           len=Math.max(len,i-left+1);
        }
        return len;

    }
}