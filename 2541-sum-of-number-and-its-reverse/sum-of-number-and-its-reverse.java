class Solution {
    public boolean sumOfNumberAndReverse(int num) {
     for(int i=0;i<=num;i++){
        int rev = reverse(i);
        if(i+rev==num){
            return true;
        }
     }
     return false;  

    }
    private int reverse(int x){
        int r=0;
        while(x>0){
            int d = x%10;
            r=r*10+d;
            x=x/10;
        }
        return r;
    }
}