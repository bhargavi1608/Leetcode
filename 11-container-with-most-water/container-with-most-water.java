class Solution {
    public int maxArea(int[] height) {
        int h = height.length;
        int left =0;
        int right = h-1;
        int max=0;
        while(left<right){
            int l = Math.min(height[left],height[right]);
            int b = right-left;
            int area=l*b;
            max = Integer.max(max,area);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
           
        }
        return max;

    }
}