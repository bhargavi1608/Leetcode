class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int total=0;
        int left=0,right=n-1;
        int leftmax =0;
        int rightmax = 0;
        while(left<=right){
            if(height[left]<=height[right]){
                if(leftmax>height[left]){
                    total+=leftmax-height[left];
                }else{
                    leftmax=height[left];
                }
                left++;
            }else{
                if(rightmax>height[right]){
                    total+=rightmax-height[right];

                }else{

                    rightmax = height[right]; 
                }
                right--;
            }

        }
        return total;
    }
}