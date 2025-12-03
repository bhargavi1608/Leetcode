class Solution {
    public int maxArea(int[] height) {
        int h = height.length;
        int left =0;
        int right = h-1;
        int max=0;
        for(int i=0;i<h;i++){
            int l = Math.min(height[left],height[right]);
            int b = right-left;
            int area=l*b;
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
            max = Integer.max(max,area);
        }
        return max;

    }
}