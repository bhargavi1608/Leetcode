class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int maxarea =0;
        while(left<right){
            int min = Math.min(height[left],height[right]);
            int area = min*(right-left);
            maxarea=Math.max(area,maxarea);
            if(min==height[left]){
                left++;
            }else{
                right--;
            }
        }
        return maxarea;
        
    }
}