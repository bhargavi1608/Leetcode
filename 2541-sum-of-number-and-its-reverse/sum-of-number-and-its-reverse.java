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
        String s = Integer.toString(x);
        String rev = new StringBuilder(s).reverse().toString();
        int revnum = Integer.parseInt(rev);
        return revnum;
    }
}