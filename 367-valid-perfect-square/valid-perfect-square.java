class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<2) return true;
        int left=0,right=num/2;
        int ans =0;
        while(left<=right){
            int mid = left+(right-left)/2;
            long square = (long) mid*mid;
            if(square==num){
                return true;
            }else if(square<num){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return false;
    }
}